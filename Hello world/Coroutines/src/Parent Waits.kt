import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    val child = launch{
        launch {
            delay(1000)
            println("This is 1")
        }
        delay(1000)
        println("child is done now!")
    }
    child.join()
    println("Parent is done now!")
}