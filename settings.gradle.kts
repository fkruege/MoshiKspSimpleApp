pluginManagement {
    plugins {
        id("com.google.devtools.ksp") version "1.5.0-1.0.0-alpha09" apply false
    }
    repositories {
        gradlePluginPortal()
        google()
    }
}

rootProject.name = "MoshiKspSImpleApp"
include(":app")
