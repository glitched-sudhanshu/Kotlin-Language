import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.math.E

fun main() = runBlocking<Unit>{

    //will crash
    try {
        launch {
            throw Exception()
        }
    } catch (_:Exception){
        println("Caught exception!")
    }

    try {
        doSomeTask()
    } catch (_:Exception){
        println("Caught exception!")
    }

}

private suspend fun doSomeTask(){
    coroutineScope {
        launch {
            throw Exception()
        }
    }
}