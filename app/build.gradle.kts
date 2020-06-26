plugins {
    id("com.android.application")
    kotlin("android")
}

apply(from = "$rootDir/buildSrc/android.kts")

android {

    defaultConfig {
        applicationId = "com.multimodule"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Libraries.Kotlin.stdLib)
    implementation(Libraries.Android.ktxCore)
    implementation(Libraries.Android.appCompat)
    implementation(Libraries.Android.activity)
    implementation(Libraries.Android.constraintLayout)

    testImplementation(Libraries.Test.junit4)

    androidTestImplementation(Libraries.Test.testRunner)
    androidTestImplementation(Libraries.Test.espresso)

}