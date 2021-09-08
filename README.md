[![Build Status](http://localhost:82/app/rest/builds/buildType:SmartRouter_Build/statusIcon)](http://localhost:82/viewType.html?buildTypeId=SmartRouter_Build&guest=1)
[![Coverage](https://img.shields.io/codecov/c/github/batect/batect.svg)](https://codecov.io/gh/batect/batect)
[![CII Best Practices](https://bestpractices.coreinfrastructure.org/projects/2698/badge)](https://bestpractices.coreinfrastructure.org/projects/2698)
[![License](https://img.shields.io/github/license/batect/batect.svg)](https://opensource.org/licenses/Apache-2.0)
[![Chat](https://img.shields.io/badge/chat-on%20GitHub%20Discussions-brightgreen.svg)](https://github.com/batect/batect/discussions)

# TeamCity Integration Sample
A sample skeleton project to test how TeamCity CI, Docker & Batect (created by TWer) work

# Get Started

To use this project, follow steps below:

1. Install Docker locally 
2. Run the following command to run TeamCity Server in Docker:

```dockerfile
docker run -it --name teamcity-server-instance \
-v ~/TeamCity/data:/data/teamcity_server/datadir \
-v ~/TeamCity/logs:/opt/teamcity/logs \
-p 8111:8111 \
jetbrains/teamcity-server

```
Don't forget to create `~/TeamCity/data` and `~/TeamCity/logs` folders

3. Install a Linux Build Agent by running:

```dockerfile
docker run -d --name teamcity-agent-instance \
-e SERVER_URL="http://teamcity-server-instance:8111" \
--link teamcity-server-instance \
-v ~/TeamCity/agent/conf:/data/teamcity_agent/conf \
jetbrains/teamcity-agent
```
This use `--link` feature to get the agent to connect to the TC server instance
Don't forget to create '~/TeamCity/agent/conf' folder

4. Go to `localhost:8111` and create the TeamCity project
5. Add connection to GitHub, follow the instruction to register TeamCity on Github
6. Sign in to Github and add the project