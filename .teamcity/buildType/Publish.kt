package buildType

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.DslContext
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object Publish : BuildType({
    name = "Publish"

    allowExternalStatus = true

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {

        script {
            name = "Batect Build"
            scriptContent = """
                #!/bin/bash
                docker login 192.168.121.161:80 -u admin -p Harbor12345
                docker tag apprentice-skeleton:latest 192.168.121.161:80/public/apprentice-skeleton:latest
                docker push 192.168.121.161:80/public/apprentice-skeleton:latest
            """
        }
    }

    triggers {
        vcs {
        }
    }
})