plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.dagger.hilt.android")
    kotlin("kapt")
}

apply<MainGradlePlugin>()

android {
    namespace = "com.dviss.hotels_data"
}

dependencies {

    room()
    retrofit()
    hilt()

    core()
    hotelsDomain()
}