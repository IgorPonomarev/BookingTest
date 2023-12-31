plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply<MainGradlePlugin>()

android {
    namespace = "com.dviss.core"
}

dependencies {
    hilt()

    retrofit()
}