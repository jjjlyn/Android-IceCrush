plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")
}

(android as com.android.build.gradle.internal.dsl.BaseAppModuleExtension).run {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

androidApplicationConfig()


dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(project(":feature:main"))
    implementation(project(":feature:core"))
    implementation(project(":data:api"))
    implementation(project(":data:db"))
    implementation(project(":data:repository"))
    kotlinLibraries()
    androidX()
    androidXLifecycle()
    di()
    network()
    util()
    image()
    compose()
}
