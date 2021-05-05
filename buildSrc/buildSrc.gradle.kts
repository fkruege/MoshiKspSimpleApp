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
            id = "amex.gradle.moshi-kapt"
            implementationClass = "amex.gradle.MoshiKaptPlugin"
        }
    }
}
