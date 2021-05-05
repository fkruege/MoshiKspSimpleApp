plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
}

gradlePlugin {
    plugins {

        register("moshi-kapt") {
            id = "moshikspsimpleapp.gradle.moshi-kapt"
            implementationClass = "moshikspsimpleapp.gradle.MoshiKaptPlugin"
        }
    }
}
