<#
PowerShell script to organize project files into folders by type.
Run from project root (or double-click in Explorer). It will skip important files and directories.
#>

$root = Split-Path -Parent $MyInvocation.MyCommand.Definition
Write-Host "Organizing files in: $root" -ForegroundColor Cyan

# Folders to create (relative to project root)
$folders = @{
    images = @('*.png','*.jpg','*.jpeg','*.gif')
    forms  = @('*.form')
    classes = @('*.class')
    properties = @('*.properties')
    libs = @('*.jar')
    sources = @('*.java')
}

# Paths to ignore (do not move files from these)
$ignoreDirs = @('.git','.vscode','build','target','lib')

# Helper: ensure folder exists
function Ensure-Folder([string]$name){
    $dir = Join-Path $root $name
    if(-not (Test-Path $dir)){
        New-Item -Path $dir -ItemType Directory | Out-Null
        Write-Host "Created folder: $name"
    }
    return $dir
}

# Get files at root only (not in subfolders)
$files = Get-ChildItem -Path $root -File -Force | Where-Object {
    # Skip this script and the pom/README and the .vscode files
    $exclude = @('pom.xml','README.md','organize-files.ps1','download-pom.xml')
    -not ($exclude -contains $_.Name)
}

foreach($group in $folders.GetEnumerator()){
    $targetDir = Ensure-Folder($group.Key)
    foreach($pattern in $group.Value){
        $matches = $files | Where-Object { $_.Name -like $pattern }
        foreach($f in $matches){
            $dest = Join-Path $targetDir $f.Name
            if(Test-Path $dest){
                # If name conflict, append timestamp
                $dest = Join-Path $targetDir ("{0}_{1}{2}" -f [System.IO.Path]::GetFileNameWithoutExtension($f.Name), (Get-Date -Format yyyyMMddHHmmss), $f.Extension)
            }
            Move-Item -Path $f.FullName -Destination $dest
            Write-Host "Moved $($f.Name) -> $($group.Key)/" -ForegroundColor Green
        }
    }
}

# Move any other loose files (optional): put into 'other' except known important files
$otherFiles = Get-ChildItem -Path $root -File -Force | Where-Object {
    $known = @('pom.xml','README.md','.project','.classpath')
    -not ($known -contains $_.Name) -and -not ($folders.Keys | ForEach-Object { $_ })
}

if($otherFiles.Count -gt 0){
    $otherDir = Ensure-Folder('other')
    foreach($f in $otherFiles){
        # skip files we already moved
        if($f.DirectoryName -ieq $root){
            $dest = Join-Path $otherDir $f.Name
            if(Test-Path $dest){
                $dest = Join-Path $otherDir ("{0}_{1}{2}" -f [System.IO.Path]::GetFileNameWithoutExtension($f.Name), (Get-Date -Format yyyyMMddHHmmss), $f.Extension)
            }
            Move-Item -Path $f.FullName -Destination $dest
            Write-Host "Moved $($f.Name) -> other/" -ForegroundColor Yellow
        }
    }
}

Write-Host "Organization complete." -ForegroundColor Cyan
Write-Host "Folders created: $($folders.Keys -join ', ') and 'other' if applicable." -ForegroundColor Cyan

# End of script
