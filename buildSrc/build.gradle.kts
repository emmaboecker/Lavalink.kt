plugins {
    groovy
    `kotlin-dsl`
}

group = "me.schlaubi"
version = "3.0.1"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.6.10"))
    implementation(kotlin("serialization", version = "1.6.10"))
    implementation("org.jetbrains.dokka", "dokka-gradle-plugin", "1.6.10")
    implementation(kotlin("gradle-plugin-api", version = "1.6.10"))
    implementation(gradleApi())
    implementation(localGroovy())
}
