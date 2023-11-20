pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BookingTest"
include(":app")
include(":core")
include(":hotels")
include(":hotels:hotels_domain")
include(":hotels:hotels_presentation")
include(":hotels:hotels_data")
include(":booking")
include(":booking:booking_domain")
include(":booking:booking_presentation")
include(":booking:booking_data")
