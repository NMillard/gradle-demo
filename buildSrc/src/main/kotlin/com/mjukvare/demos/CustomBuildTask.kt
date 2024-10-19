import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class CustomBuildTask : DefaultTask() {
    @get:Input
    abstract val myThing: Property<String>

    @TaskAction
    fun run() {
        println("my stuff!! ${myThing}")
    }
}