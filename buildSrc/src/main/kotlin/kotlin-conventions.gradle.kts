import org.gradle.accessors.dm.LibrariesForLibs
import org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES

plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}


val libs = the<LibrariesForLibs>()

// replace kotlin version in spring boot bom
extra["kotlin.version"] = libs.versions.kotlin.get()
dependencies {
    implementation(platform(BOM_COORDINATES))
}

//val jvmVersion = libs.versions.jvm.get
kotlin {
    jvmToolchain(25)
    compilerOptions {
        freeCompilerArgs.addAll(
            listOf("-Xjsr305=strict")
        )
    }
}


tasks.test {
    useJUnitPlatform()
}
