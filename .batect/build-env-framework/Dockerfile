FROM mcr.microsoft.com/dotnet/framework/sdk:4.8-windowsservercore-ltsc2019
# hadolint seems to be broken for windows dockerfiles and setting the workdir gets called out by hadolint no matter the format
# hadolint ignore=DL3045
COPY installGit.ps1 .
RUN powershell -File installGit.ps1