plugins {
    `java-library`
}

dependencies {
    implementation(libs.logback)
    implementation("ch.qos.logback:logback-core:${providers.gradleProperty("logback.version").get()}")
    implementation("ch.qos.logback:logback-classic:${providers.gradleProperty("logback.version").get()}")
    implementation("org.slf4j:slf4j-api:${providers.gradleProperty("slf4j.version")}")
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
}