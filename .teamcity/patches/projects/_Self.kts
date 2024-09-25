package patches.projects

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.amazonEC2CloudImage
import jetbrains.buildServer.configs.kotlin.amazonEC2CloudProfile
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the root project
accordingly, and delete the patch script.
*/
changeProject(DslContext.projectId) {
    features {
        add {
            amazonEC2CloudImage {
                id = "PROJECT_EXT_9"
                profileId = "amazon-8"
                name = "For matrix build"
                vpcSubnetId = "subnet-043178c302cabfe37"
                instanceType = "c1.medium"
                securityGroups = listOf("sg-072d8bfa0626ea2a6")
                instanceTags = mapOf(
                    "Owner" to "olga.sventukh@jetbrains.com"
                )
                source = Source("ami-0e303c7d2285132c7")
            }
        }
        add {
            amazonEC2CloudProfile {
                id = "amazon-8"
                name = "For matrix build"
                terminateIdleMinutes = 30
                region = AmazonEC2CloudProfile.Regions.EU_WEST_DUBLIN
                authType = accessKey {
                    keyId = "credentialsJSON:33d3c098-930b-426f-96de-27433c1a892e"
                    secretKey = "credentialsJSON:5a4d1301-54d2-49aa-be81-992919d2b286"
                }
            }
        }
    }
}
