const val kotlin = "1.3.21"

object Build {

    private object Versions {
        const val buildTools = "4.0.0"
        const val googleServices = "4.3.3"
    }

    const val androidGradle = "com.android.tools.build:gradle:${Versions.buildTools}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin"

}

object AndroidSdk {
    const val min = 21
    private const val compile = 29
    const val target = compile
}

object Libraries {

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin"
    }

    object Android {
        private object Versions {
            const val ktx = "1.2.0"
            const val jetPack = "1.1.0"
            const val constraintLayout = "1.1.3"
            const val lifeCycle = "2.2.0"
            const val activity = "1.1.0"
        }

        const val appCompat = "androidx.appcompat:appcompat:${Versions.jetPack}"
        const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
        const val activity = "androidx.activity:activity-ktx:${Versions.activity}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val viewModelLifecycle =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycle}"
    }

    object Test {
        private object Versions {
            const val junit4 = "1.1.1"
            const val testRunner = "1.1.01"
            const val espresso = "3.2.0"
        }

        const val junit4 = "androidx.test.ext:junit:${Versions.junit4}"
        const val testRunner = "androidx.test:runner:${Versions.testRunner}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }

    object Coroutines {

        private object Versions {
            const val core = "1.3.5"
        }

        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.core}"
    }

    object Externals {

        private object Versions {
            const val dagger = "2.25.3"
            // Networking
            const val retrofit = "2.7.2"
            const val gson = "2.8.5"
            const val okhttp = "4.1.0"
        }

        const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
        const val daggerAndroidSupport =
            "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val daggerAnnotationProcessor =
            "com.google.dagger:dagger-android-processor:${Versions.dagger}"

        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gson = "com.google.code.gson:gson:$${Versions.gson}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"

    }

}

