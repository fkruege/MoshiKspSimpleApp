package amex.gradle

//import amex.gradle.Libs.Moshi
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.provideDelegate

/**
 * Plugin that runs kapt moshi codegen if runKapt=true
 */
class MoshiKaptPlugin : Plugin<Project> {
    override fun apply(project: Project) = with(project) {

//        val runKapt: Boolean by project
//
//        if (!runKapt) return@with

//        plugins.apply("amex.gradle.properties")

        plugins.apply("org.jetbrains.kotlin.kapt")
//        plugins.apply("com.google.devtools.ksp:symbol-processing-api:1.4.32-1.0.0-alpha08")
//        plugins.apply("com.google.devtools.1.4.32-1.0.0-alpha08")
//        plugins.apply("com.google.devtools.ksp")
//        plugins.apply("amex.gradle.moshi-ksp-test")
//        Plugin("com.google.devtools.ksp")
//        plugins.apply(id = "com.google.devtools.ksp:symbol-processing-api:1.4.32-1.0.0-alpha08")

        dependencies {
            "kapt"("com.squareup.moshi:moshi-kotlin-codegen:1.12.0")
//            "ksp"("dev.zacsweers.moshix:moshi-ksp:1.4.32-1.0.0-alpha08")
        }
    }
}
