plugins {
    kotlin("jvm") version "1.8.20"
}

group = "cn.hyrkg.fastspigotkt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}