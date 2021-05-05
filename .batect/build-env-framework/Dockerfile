FROM mcr.microsoft.com/dotnet/framework/sdk:4.8
# hadolint seems to be broken for windows dockerfiles and setting the workdir gets called out by hadolint no matter the format
# hadolint ignore=DL3045
COPY install.ps1 .

RUN powershell -File install.ps1