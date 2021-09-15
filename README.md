[![Build Status](http://localhost:82/app/rest/builds/buildType:SmartRouter_Build/statusIcon)](http://localhost:82/viewType.html?buildTypeId=SmartRouter_Build&guest=1)
[![Coverage](https://img.shields.io/codecov/c/github/batect/batect.svg)](https://codecov.io/gh/batect/batect)
[![CII Best Practices](https://bestpractices.coreinfrastructure.org/projects/2698/badge)](https://bestpractices.coreinfrastructure.org/projects/2698)
[![License](https://img.shields.io/github/license/batect/batect.svg)](https://opensource.org/licenses/Apache-2.0)
[![Chat](https://img.shields.io/badge/chat-on%20GitHub%20Discussions-brightgreen.svg)](https://github.com/batect/batect/discussions)

# TeamCity Integration Sample
A sample skeleton project to test how TeamCity CI, Docker & Batect (created by TWer) work

## Get Started

This repo requires some environment setting as follows:

1. A VM that runs TeamCity and its Agent
2. A VM that runs Harbor as docker image repo
3. K8S clastur

How did I do this:
I use the following VMs running CentOS server in a PC using NAT network
1. k8s-server 192.168.121.131
2. k8s-node-01 192.168.121.132
3. k8s-node-02 192.168.121.133
4. tc-server 192.168.121.151
5. harbor-server 192.168.121.161

To get TeamCity and Harbor accessable from other machines within my home network, I used the following port fowarding:

TeamCity server 192.168.121.151:8111 -> 192.168.1.107:8111
Harbor server 192.168.121.161:80 -> 192.168.1.107:8112

I also forwarder ssh ports to my home network.

I setup static IP for my PC (192.168.1.107) and all my VMs.


### OLD -- reference only

To use this project, follow steps below:

1. Install Docker locally 
2. Run Docker Compose

```dockerfile
docker-compose up -d
```
(To stop the server run `docker-compose stop`)

3. Go to `localhost:8111` and create TeamCity project
4. Add connection to GitHub and connect to project VCS root
