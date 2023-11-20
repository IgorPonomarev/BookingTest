plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

apply<MainGradlePlugin>()

android {
    namespace = "com.dviss.hotels_presentation"
}

dependencies {

    androidX()
    hilt()

    core()
    hotelsDomain()
    hotelsData()
}