plugins {
    id("java")
    kotlin("jvm") version "2.0.0"
}

group = "com.kyh.algorithms"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
