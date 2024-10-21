# Gradle demo

Simple repository to experiment with Gradle.

## Basics

Creating a Gradle project is simple: just add a `build.gradle.kts` file to your project directory.

For multi-module projects, the `build.gradle.kts` is optional in the root project directory. You'll instead
need a `settings.gradle.kts` to be present.

## `gradle.build.kts`

Defines the build configuration for a project.

## `settings.gradle.kts`

The main role of this file is to mark the project as root and include submodules.  
You also define the root project name here.

### `gradle.properties`

Provide run arguments to gradle itself when running gradle tasks.
Values can be overridden by settings in `~/.gradle/gradle.properties`, and values provided by the command-line arguments.

Environment variables may also be used by prefixing variables with `systemProp`.

It's worth noting that all project can use properties from this file–this shouldn't be used for dependency versions.  
For dependency versions, use the `libs.versions.toml` file within the `buildSrc` project.

### `buildSrc` project

This is a special gradle project. This project is built before any other project and provides functionality that may be
referenced in other `build.gradle.kts` files.

```text
| (root)
| build.gradle.kts
|- buildSrc/
|-–– build.gradle.kts
|-–– src/main/kotlin
```

## SonarQube

Run the docker-compose file and access sonarqube at http://localhost:9000
Set up a manual project and copy the login token to [`gradle.properties`](gradle.properties).

## Links
- [Good overview of Gradle](https://stackoverflow.com/questions/45387971/when-to-use-gradle-properties-vs-settings-gradle)