import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

fun DependencyHandlerScope.androidX() {
    //androidx
    "implementation"(Libraries.appCompat)
    "implementation"(Libraries.coreKtx)
    "implementation"(Libraries.lifecycleViewModel)
    "implementation"(Libraries.lifecycleLiveData)
    "implementation"(Libraries.lifecycleProcess)
    "implementation"(Libraries.activity)
    "implementation"(Libraries.fragment)
    "implementation"(Libraries.constraintLayout)
    "implementation"(Libraries.material)
    "implementation"(Libraries.recyclerView)
    "implementation"(Libraries.navigationUi)
    "implementation"(Libraries.navigationFragment)
}

fun DependencyHandlerScope.androidXLifecycle() {
    "implementation"(Libraries.lifecycleViewModel)
    "implementation"(Libraries.lifecycleLiveData)
}

fun DependencyHandlerScope.kotlinLibraries() {
    "implementation"(Libraries.kotlinStdLib)
    "implementation"(Libraries.coroutine)
}

fun DependencyHandlerScope.di() {
    "implementation"(Libraries.hilt)
    "implementation"(Libraries.hiltNavigation)
    "kapt"(Libraries.hiltCompiler)
}

fun DependencyHandlerScope.network() {
    "implementation"(Libraries.retrofit)
    "implementation"(Libraries.retrofitGsonConverter)
    "implementation"(Libraries.okhttp)
    "implementation"(Libraries.okhttpLoggingInterceptor)
    "implementation"(Libraries.moshi)
    "implementation"(Libraries.gson)
}
fun DependencyHandlerScope.util() {
    "implementation"(Libraries.timber)

}




fun DependencyHandlerScope.image() {
    "kapt"(Libraries.glideCompiler)
    "implementation"(Libraries.glide)
    "implementation"(Libraries.glideOkHttpIntegration)
    "implementation"(Libraries.lottie)
}

