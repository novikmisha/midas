plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.kotlin.spring)
    implementation(libs.spring.gradle)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
