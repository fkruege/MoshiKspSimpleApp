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

//        plugins.apply("com.google.devtools.ksp")
        plugins.apply("org.jetbrains.kotlin.kapt")

        dependencies {
            "kapt"("com.squareup.moshi:moshi-kotlin-codegen:1.12.0")
//            "ksp"("dev.zacsweers.moshix:moshi-ksp:0.10.0")
        }
    }
}
