version = "1.0.0-SNAPSHOT"
group = "com.mjukvare"

allprojects {
    version = version
}

// There are 3 types of plugins:
// - core: are provided by gradle
// - community: created by others
// - local: your own custom plugins
plugins {
    java // core
    id("org.flywaydb.flyway") version "6.3.2" // community
    kotlin("jvm") version "2.0.20"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}