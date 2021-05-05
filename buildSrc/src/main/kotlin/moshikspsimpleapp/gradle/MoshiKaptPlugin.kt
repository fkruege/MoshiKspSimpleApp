package moshikspsimpleapp.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

/**
 * Plugin that runs kapt moshi codegen if runKapt=true
 */
class MoshiKaptPlugin : Plugin<Project> {
    override fun apply(project: Project) = with(project) {

//        plugins.apply("moshikspsimpleapp.gradle.properties")

//        val runKapt: Boolean by project
//
//        if (!runKapt) return@with

//        plugins.apply("amex.gradle.properties")

//        plugins.apply("org.jetbrains.kotlin.kapt")

// cannot find        plugins.apply("com.google.devtools.ksp")
//        plugins.apply("com.google.devtools.ksp")

//        plugins.apply("com.google.devtools.ksp:symbol-processing-gradle-plugin:1.5.0-1.0.0-alpha09")
//        plugins.apply("com.google.devtools.ksp:symbol-processing-gradle-plugin:1.5.0-1.0.0-alpha09") version "1.5"

//        plugins.apply("com.google.devtools.1.4.32-1.0.0-alpha08")
//        plugins.apply("amex.gradle.moshi-ksp-test")
//        Plugin("com.google.devtools.ksp")
//        plugins.apply(id = "com.google.devtools.ksp:symbol-processing-api:1.4.32-1.0.0-alpha08")

        dependencies {
//            "kapt"("com.squareup.moshi:moshi-kotlin-codegen:1.12.0")
//            "ksp"("dev.zacsweers.moshix:moshi-ksp:0.10.0")
        }

//        repositories {
//            gradlePluginPortal()
//            mavenCentral()
//            google()
//        }
    }
}
