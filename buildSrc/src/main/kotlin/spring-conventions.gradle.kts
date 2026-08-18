import org.gradle.accessors.dm.LibrariesForLibs

plugins {
    id("kotlin-conventions")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

val libs = the<LibrariesForLibs>()

dependencies {
    implementation(libs.spring.starter)
    testImplementation(libs.spring.test.starter)
}
