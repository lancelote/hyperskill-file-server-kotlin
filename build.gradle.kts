plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.pavelkarateev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.12.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.12.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}
