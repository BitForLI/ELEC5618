pluginManagement {
    includeBuild("source/build-logic")
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

includeBuild("source/shared")
includeBuild("source/desktop")
includeBuild("source/web")
