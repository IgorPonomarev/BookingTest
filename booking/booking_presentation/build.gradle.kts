plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply<MainGradlePlugin>()

android {
    namespace = "com.dviss.booking_presentation"
}

dependencies {

    androidX()
    hilt()

    core()
    bookingDomain()
    bookingData()
}