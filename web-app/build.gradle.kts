import com.adarshr.gradle.testlogger.theme.ThemeType

plugins {
    application

    // Add common spring plugin functionality
    // such as building an image, running the app, and so on.
    id("org.springframework.boot") version "3.3.4"

    id("com.adarshr.test-logger") version "2.0.0" // better test logging
    id("org.sonarqube") version "5.1.0.4882"
}

// Not necessary for a spring app
// but still worth having here for
// future reference.
application {
    mainClass = "com.mjukvare.demos.webapp.App"
}

dependencies {
    // Take a dependency on another module.
    // the colon (:) here is the project root.
    implementation(project(":persistence"))

    implementation("org.springframework.boot:spring-boot-starter-web:3.3.4")

    testImplementation("org.junit.jupiter:junit-jupiter:5.11.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11.2")
    testImplementation("org.assertj:assertj-core:3.8.0")
    testCompileOnly("org.projectlombok:lombok:1.18.34")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.34")
}

val projectKey = "${rootProject.group}-${project.name}"
println("Using sonar project key: ${projectKey}")

sonar {
    properties {
        property("sonar.projectKey", projectKey)
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
    testlogger {
        theme = ThemeType.MOCHA
        showExceptions = true
        showStackTraces = true
        showFullStackTraces = true
        showCauses = true
        slowThreshold = 2000
        showSummary = true
        showSimpleNames = true
        showPassed = true
    }
}

