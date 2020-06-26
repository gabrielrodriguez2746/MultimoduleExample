plugins {
    id("java-library")
    kotlin("jvm")
    kotlin("kapt")
}

apply(from = "$rootDir/buildSrc/ktlint.gradle.kts")

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libraries.Kotlin.stdLib)

    implementation(Libraries.Externals.dagger)
    implementation(Libraries.Externals.retrofit)
    implementation(Libraries.Externals.gsonConverter)
    implementation(Libraries.Externals.loggingInterceptor)
}
