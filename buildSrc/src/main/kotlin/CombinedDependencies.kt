import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.room() {
    implementation(Dependencies.room)
    kapt(Dependencies.roomCompiler)
    implementation(Dependencies.roomKtx)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLogging)
    implementation(Dependencies.retrofit)
}

fun DependencyHandler.hilt() {
    implementation(Dependencies.hiltAndroid)
    //implementation(Dependencies.hiltAgp)
    kapt(Dependencies.hiltCompiler)
}

fun DependencyHandler.androidX() {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.appCompat)
    implementation(Dependencies.material)
}

fun DependencyHandler.navigation() {
    implementation(Dependencies.navigationUi)
    implementation(Dependencies.navigationFragment)
}