package buildType

import jetbrains.buildServer.configs.kotlin.v2019_2.BuildType
import jetbrains.buildServer.configs.kotlin.v2019_2.DslContext
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object Compile : BuildType({
    name = "Compile"

    allowExternalStatus = true

    vcs {
        root(DslContext.settingsRoot)
    }

    steps {

        script {
            name = "Batect Build"
            scriptContent = """
                #!/bin/bash
                ./batect build
            """
        }
    }

    triggers {
        vcs {
        }
    }
})