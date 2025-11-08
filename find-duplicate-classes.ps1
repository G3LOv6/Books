# Find duplicate .class filenames in the project and print their full paths
$root = 'C:\Users\Gelo\Documents\NetBeansProjects\Login_panels'
Get-ChildItem -Path $root -Recurse -Filter '*.class' -File |
    Group-Object -Property Name |
    Where-Object { $_.Count -gt 1 } |
    ForEach-Object {
        Write-Host "--- $($_.Name) (x$($_.Count)) ---" -ForegroundColor Cyan
        $_.Group | ForEach-Object { Write-Host $_.FullName }
    }
