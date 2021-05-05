package moshikspsimpleapp.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

/**
 * Plugin that runs ksp moshi codegen if runKapt=true
 */
class MoshiKspPlugin : Plugin<Project> {
    override fun apply(project: Project) = with(project) {

        plugins.apply("com.google.devtools.ksp")

        dependencies {
            "ksp"("dev.zacsweers.moshix:moshi-ksp:0.10.0")
        }
    }
}
