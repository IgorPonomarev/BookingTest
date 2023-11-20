import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

fun DependencyHandler.core() {
    implementation(project(":core"))
}

fun DependencyHandler.hotelsData() {
    implementation(project(":hotels:hotels_data"))
}
fun DependencyHandler.hotelsDomain() {
    implementation(project(":hotels:hotels_domain"))
}
fun DependencyHandler.hotelsPresentation() {
    implementation(project(":hotels:hotels_presentation"))
}

fun DependencyHandler.bookingData() {
    implementation(project(":booking:booking_data"))
}
fun DependencyHandler.bookingDomain() {
    implementation(project(":booking:booking_domain"))
}
fun DependencyHandler.bookingPresentation() {
    implementation(project(":booking:booking_presentation"))
}