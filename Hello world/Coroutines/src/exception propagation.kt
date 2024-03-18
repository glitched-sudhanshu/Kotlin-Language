import kotlinx.coroutines.*

fun main() {
    ordinaryJob()
    supervisorJob()
}

private fun ordinaryJob(){
    val exceptionHandler = CoroutineExceptionHandler{_, throwable ->
        println("Caught exception $throwable")
    }
    val scope = CoroutineScope(Job() + exceptionHandler)

    scope.launch {
        println("Coroutine 1 starts")
        delay(50)
        println("Coroutine 1 fails")
        throw RuntimeException()
    }

    scope.launch {
        println("Coroutine 2 starts")
        delay(500)
        println("Coroutine 2 completed")
    }.invokeOnCompletion {
        if(it is CancellationException){
            println("Coroutine 2 got cancelled")
        }
    }
    Thread.sleep(1000)
    println("Scope got cancelled : ${!scope.isActive}")
}

private fun supervisorJob(){
    val exceptionHandler = CoroutineExceptionHandler{_, throwable ->
        println("Caught exception $throwable")
    }
    val scope = CoroutineScope(SupervisorJob() + exceptionHandler)

    scope.launch {
        println("Coroutine 1 starts")
        delay(50)
        println("Coroutine 1 fails")
        throw RuntimeException()
    }

    scope.launch {
        println("Coroutine 2 starts")
        delay(500)
        println("Coroutine 2 completed")
    }.invokeOnCompletion {
        if(it is CancellationException){
            println("Coroutine 2 got cancelled")
        }
    }
    Thread.sleep(1000)
    println("Scope got cancelled : ${!scope.isActive}")

}