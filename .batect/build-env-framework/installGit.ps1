Invoke-WebRequest 'https://github.com/git-for-windows/git/releases/download/v2.25.0.windows.1/MinGit-2.25.0-64-bit.zip' -OutFile c:\MinGit.zip
Expand-Archive c:\MinGit.zip -DestinationPath c:\MinGit;
$env:PATH = $env:PATH + ';C:\MinGit\cmd\;C:\MinGit\cmd';
Set-ItemProperty -Path 'HKLM:\SYSTEM\CurrentControlSet\Control\Session Manager\Environment\' -Name Path -Value $env:PATH