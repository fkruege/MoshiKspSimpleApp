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

        register("moshi-ksp") {
            id = "moshikspsimpleapp.gradle.moshi-ksp"
            implementationClass = "moshikspsimpleapp.gradle.MoshiKspPlugin"
        }
    }
}
