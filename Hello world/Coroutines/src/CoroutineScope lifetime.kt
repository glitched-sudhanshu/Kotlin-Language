import kotlinx.coroutines.*

private val scope = CoroutineScope(Dispatchers.IO)

fun main() = runBlocking {
//    childCancelled()
//    parentCancelled()

    val job = scope.launch {
        delay(100)
        println("Coroutine work completed!")
    }

    job.invokeOnCompletion {
        if(it is CancellationException){
            println("Coroutine is cancelled!")
        }
    }
    //but position does not affect in this case
    //but if I wrap it in a function then it behaves diff
    delay(50)
    onDestroy()

    delay(1000)
    println()
}

//cancelled parent, but child was also cancelled
private suspend fun parentCancelled() {
    var jobChild: Job? = null
    val job = scope.launch {


        delay(100)
        println("This is parent coroutine")
        jobChild = launch {
            delay(100)
            println("This is child coroutine")
        }
    }

    //why o/p differs when position of this is changed?
    delay(50)
    onDestroy()

    job.invokeOnCompletion {
        if (it is CancellationException) {
            println("Parent coroutine is cancelled!")
        }
    }
    jobChild?.invokeOnCompletion {
        if (it is CancellationException) {
            println("Child coroutine is cancelled!")
        }
    }
    println()
}


//cancelled child, but parent was not, coz cancellation exception is not propagated upwards
private suspend fun childCancelled() {
    var job: Job? = null
    val parentScope = CoroutineScope(Dispatchers.IO)
    val jobParent = parentScope.launch {
        job = scope.launch {
            delay(100)
            println("This is child coroutine")
        }
        delay(100)
        println("This is parent coroutine")
    }

    //doubt: Neeche rakho toh alag behave
    delay(50)
    onDestroy()

    job?.invokeOnCompletion {
        if (it is Exception) {
            println("Child coroutine is cancelled! ${it.message}")
        }
    }
    jobParent.invokeOnCompletion {
        if (it is Exception) {
            println("Parent coroutine is cancelled! ${it.message}")
        }
    }
}

private fun onDestroy() {
    println("App lifetime completed!")
    scope.cancel()
}