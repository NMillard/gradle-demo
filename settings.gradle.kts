rootProject.name = "JavaGradleDemo"

include("persistence", "web-app", "application")

// This removes the need for defining
// mavenCentral in repositories for all submodules.
dependencyResolutionManagement {
    repositories.mavenCentral()
}