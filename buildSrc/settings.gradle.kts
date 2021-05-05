 pluginManagement {
    plugins {
        id("com.google.devtools.ksp") version "1.5.0-1.0.0-alpha09" apply false
    }
    repositories {
        gradlePluginPortal()
        google()
    }
 }



// Rename the main build file from build.gradle to buildSrc.gradle
rootProject.buildFileName = "buildSrc.gradle.kts"
