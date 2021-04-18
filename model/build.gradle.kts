plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

commonAndroidConfig()

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    kotlinLibraries()
    androidX()
    androidXLifecycle()
    di()
    network()
    util()
}