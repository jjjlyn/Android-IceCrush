import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.DefaultConfig
import org.gradle.api.JavaVersion
import org.gradle.api.Project

val Project.android: BaseExtension
    get() = extensions.findByName("android") as? BaseExtension
        ?: error("Not an Android module: $name")

fun Project.androidApplicationConfig(
    appId: String = applicationId,
    appVersionCode: Int = APPLICATION_VERSION_CODE,
    appVersionName: String = APPLICATION_VERSION_NAME
) {
    commonAndroidConfig {
        applicationId = appId
        versionCode = appVersionCode
        versionName = appVersionName

        ndk {
            abiFilters.add("armeabi")
            abiFilters.add("armeabi-v7a")
            abiFilters.add("arm64-v8a")
            abiFilters.add("x86")
            abiFilters.add("x86_64")
        }
    }

    androidApplicationConfigs()
}

fun Project.androidApplicationConfigs() {
    (android as com.android.build.gradle.internal.dsl.BaseAppModuleExtension).run {
        flavorDimensions("SERVER")
        productFlavors {
            create("develop") {
                dimension = "SERVER"
            }
            create("real") {
                dimension = "SERVER"
            }
        }

        signingConfigs {
//            getByName("debug") {
//                storeFile = file("keystores/debug.keystore")
//            }
            create("release") {
//                storeFile = file("$rootProject.projectDir/" + project.property("keystorefilename"))
//                keyAlias = project.property("keyalias") as String?
//                storePassword = project.property("storepassword") as String?
//                keyPassword = project.property("keypassword") as String?
            }
        }

        buildTypes {
            getByName("debug") {
                isDebuggable = true
            }
            getByName("release") {
                isMinifyEnabled = true
                proguardFiles = mutableListOf(
                    getDefaultProguardFile("proguard-android-optimize.txt"), file(
                        "proguard-rules.pro"
                    )
                )
                // loop over all flavors to set default signing config
                productFlavors.all { flavor ->
                    flavor.signingConfig = signingConfigs.getByName("release")
                    true
                }
            }
        }

        buildFeatures.dataBinding = true
        buildFeatures.viewBinding = true
    }
}

//추가 모듈을 위함
fun Project.androidLibraryConfig() {
    commonAndroidConfig()
    androidLibraryFlavorConfig()

    (android as com.android.build.gradle.LibraryExtension).run {
        libraryVariants.all {
            buildConfigField("String", "VERSION_NAME", "\"$APPLICATION_VERSION_NAME\"")
        }
    }
}

fun Project.androidLibraryFlavorConfig() {
    android.run {
        flavorDimensions("SERVER")
        productFlavors {
            create("develop") {
                dimension = "SERVER"
            }
            create("real") {
                dimension = "SERVER"
            }

        }
    }
}

const val APPLICATION_VERSION_CODE = AppVersion.appMajorVersion * 1_000_000 +
        AppVersion.appMinorVersion * 10_000 +
        AppVersion.appHotfixVersion * 100 +
        AppVersion.appIterationVersion

const val APPLICATION_VERSION_NAME =
    "${AppVersion.appMajorVersion}.${AppVersion.appMinorVersion}.${AppVersion.appHotfixVersion}"

fun Project.commonAndroidConfig(defaultConfigExtensions: (DefaultConfig.() -> Unit)? = null) {
    android.run {
        compileSdkVersion(AndroidSdk.compile)
        defaultConfig {
            defaultConfigExtensions?.invoke(this)
            minSdkVersion(AndroidSdk.min)
            targetSdkVersion(AndroidSdk.target)
            vectorDrawables.useSupportLibrary = true
        }
        buildToolsVersion = AndroidSdk.buildTools
        compileOptions {
            targetCompatibility = JavaVersion.VERSION_1_8
            sourceCompatibility = JavaVersion.VERSION_1_8
        }
    }

}


