const val applicationId = "com.mmm.icecrush"

object AppVersion {
    const val appMajorVersion = 1
    const val appMinorVersion = 0
    const val appHotfixVersion = 0
    const val appIterationVersion = 0
}

object AndroidSdk {
    const val compile = 30
    const val min = 23
    const val target = 30
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val buildTools = "29.0.2"
}

object BuildPlugins {
    object Versions {
        const val androidGradleVersion = "4.1.2"
        const val hilt = "2.33-beta"
        const val kotlinVersion = "1.4.30"
    }

    const val androidGradlePlugin =
        "com.android.tools.build:gradle:${Versions.androidGradleVersion}"
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val navigationSafeArgsPlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:2.2.1"
    const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

}

object Libraries {

    private object Versions {
        const val appcompat = "1.2.0"
        const val material = "1.3.0"
        const val constraintLayout = "2.0.4"
        const val lifecycle = "2.2.0"
        const val navigation = "2.3.3"
        const val coroutine = "1.4.2"
        const val glide = "4.12.0"
        const val compose = "1.0.0-beta01"
    }

    //kotlin
    const val kotlinStdLib =
        "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${BuildPlugins.Versions.kotlinVersion}"
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"

    //android x
    const val coreKtx = "androidx.core:core-ktx:1.3.0"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val activity = "androidx.activity:activity-ktx:1.1.0"
    const val fragment = "androidx.fragment:fragment-ktx:1.2.5"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleProcess = "androidx.lifecycle:lifecycle-process:${Versions.lifecycle}"

    const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"

    //image
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideOkHttpIntegration =
        "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    const val lottie = "com.airbnb.android:lottie:3.6.1"

    //network
    const val retrofit = "com.squareup.retrofit2:retrofit:2.6.4"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:2.6.2"
    const val okhttp = "com.squareup.okhttp3:okhttp:4.2.1"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.2.1"
    const val socketIo = "com.jakewharton.timber:timber:4.7.1"

    //gson은 점차 사장되는거 같아서 일단 moshi도 추가는 해봤습니다!
    const val gson = "com.google.code.gson:gson:2.8.6"
    const val moshi = "com.squareup.moshi:moshi:1.11.0"

    //di
    const val hilt = "com.google.dagger:hilt-android:${BuildPlugins.Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${BuildPlugins.Versions.hilt}"
    const val hiltNavigation = "androidx.hilt:hilt-navigation-fragment:1.0.0-alpha03"

    //util
    const val timber = "com.jakewharton.timber:timber:4.7.1"

    //compose
    const val composeUI = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeUITool = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composeMaterialIconCore  = "androidx.compose.material:material-icons-core:${Versions.compose}"
    const val composeMaterialIconExtension = "androidx.compose.material:material-icons-extended:${Versions.compose}"
    const val composeViewModel =  "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha02"
    const val composeActivity =  "androidx.activity:activity-compose:1.3.0-alpha03"
    const val composeLiveData =  "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    const val composeRxJava =  "androidx.compose.runtime:runtime-rxjava2:${Versions.compose}"
}

