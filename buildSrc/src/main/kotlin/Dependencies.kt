object Dependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.material}"

    const val ksp = "com.google.devtools.ksp:symbol-processing-api:${Versions.ksp}"

    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltAgp = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"

    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    const val junit = "junit:junit:${Versions.junit}"
    const val androidJuint = "androidx.test.ext:junit:${Versions.androidJuint}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"
}