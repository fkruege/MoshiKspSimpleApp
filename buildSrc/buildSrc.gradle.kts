plugins {
    `kotlin-dsl`
    id("com.google.devtools.ksp") version "1.5.0-1.0.0-alpha09" apply false
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
