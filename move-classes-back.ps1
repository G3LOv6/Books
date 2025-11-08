# Move .class files from classes\login_panels back to build\classes\login_panels
$root = 'C:\Users\Gelo\Documents\NetBeansProjects\Login_panels'
$src = Join-Path $root 'classes\login_panels'
$dest = Join-Path $root 'build\classes\login_panels'

if(-not (Test-Path $src)){
    Write-Host "Source folder not found: $src" -ForegroundColor Yellow
    exit 0
}

if(-not (Test-Path $dest)){
    New-Item -Path $dest -ItemType Directory | Out-Null
}

Get-ChildItem -Path $src -Filter '*.class' -File -ErrorAction SilentlyContinue | ForEach-Object {
    Move-Item -Path $_.FullName -Destination $dest -Force
    Write-Host "Moved: $($_.Name)" -ForegroundColor Green
}

Write-Host "--- build\\classes\\login_panels contents ---" -ForegroundColor Cyan
Get-ChildItem -Path $dest -File | Select-Object Name | Format-Table -AutoSize

Write-Host "--- classes\\login_panels contents (should be empty) ---" -ForegroundColor Cyan
Get-ChildItem -Path $src -File -ErrorAction SilentlyContinue | Select-Object Name | Format-Table -AutoSize
