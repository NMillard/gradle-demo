version = "1.0.0-SNAPSHOT"

allprojects {
    version = version
}

plugins {
    java
    id("org.flywaydb.flyway") version "6.3.2"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("ch.qos.logback:logback-core:${providers.gradleProperty("logback.version").get()}")
    implementation("ch.qos.logback:logback-classic:${providers.gradleProperty("logback.version").get()}")
    implementation("org.slf4j:slf4j-api:${providers.gradleProperty("slf4j.version")}")
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")

    testImplementation("org.junit.jupiter:junit-jupiter:5.11.2")
    testCompileOnly("org.projectlombok:lombok:1.18.34")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.34")
}

tasks.withType<Test> {
    useJUnitPlatform()
}