//enable projects.x for implementation
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/kr328/magic")
            val actor = System.getenv("GITHUB_ACTOR")
            val token = System.getenv("GITHUB_TOKEN")
            if (!actor.isNullOrEmpty() && !token.isNullOrEmpty()) {
                credentials {
                    username = actor
                    password = token
                }
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/kr328/magic")
            val actor = System.getenv("GITHUB_ACTOR")
            val token = System.getenv("GITHUB_TOKEN")
            if (!actor.isNullOrEmpty() && !token.isNullOrEmpty()) {
                credentials {
                    username = actor
                    password = token
                }
            }
        }
    }
}

rootProject.name = "Mi-Freeform"
include(
    ":app",
    ":hidden-api",
    ":freeform-server",
    ":service"
)
