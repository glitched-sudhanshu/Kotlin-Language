import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    exceptionScenario1()
    exceptionScenario2()
    exceptionScenario3()
    Thread.sleep(1000)
}

//fail
private fun exceptionScenario1() {
    val scope = CoroutineScope(Job())
    scope.launch {
        doTask()
    }
}

//warpped task -> pass
private fun exceptionScenario2() {
    val scope = CoroutineScope(Job())
    scope.launch {
        try {
            doTask()
        } catch (_: Exception) {
            println("Exception caught")
        }
    }
}

//parent ko warp kiya try-catch se -> fail
private fun exceptionScenario3() {
    val scope = CoroutineScope(Job())
    try {
        scope.launch {
            doTask()
        }
    } catch (_: Exception) {
        println("Exception caught")
    }
}

private fun doTask() {
    throw IllegalArgumentException()
}