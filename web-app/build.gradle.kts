plugins {
    application

    // Add common spring plugin functionality
    // such as building an image, running the app, and so on.
    id("org.springframework.boot") version "3.3.4"
}

application {
    mainClass = "com.mjukvare.demos.webapp.App"
}

// Needed in submodules even though it's already defined in root build.gradle.kts
repositories {
    mavenCentral()
}

dependencies {
    // Take a dependency on another module.
    // the colon (:) here is the project root.
    implementation(project(":persistence"))

    implementation("org.springframework.boot:spring-boot-starter-web:3.3.4")
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}