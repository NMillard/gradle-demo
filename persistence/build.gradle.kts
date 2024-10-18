plugins {
    `java-library`
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>(project.name) {
            groupId = "${rootProject.group}"
            from(components["java"])
        }
    }
}

dependencies {
    implementation(libs.logback)
    implementation("ch.qos.logback:logback-core:latest.release")
    implementation("ch.qos.logback:logback-classic:latest.release")
    implementation("org.slf4j:slf4j-api:${providers.gradleProperty("slf4j.version")}")
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
}