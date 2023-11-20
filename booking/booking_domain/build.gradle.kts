plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply<MainGradlePlugin>()

android {
    namespace = "com.dviss.booking_domain"
}

dependencies {

    hilt()

    core()
}