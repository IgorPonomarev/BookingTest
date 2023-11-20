plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply<MainGradlePlugin>()

android {
    namespace = "com.dviss.booking_data"
}

dependencies {

    room()
    hilt()
    retrofit()

    core()
    bookingDomain()
}