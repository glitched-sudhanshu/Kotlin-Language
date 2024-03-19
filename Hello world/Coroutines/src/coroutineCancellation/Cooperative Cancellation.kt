import kotlinx.coroutines.*

fun main() {
    noCancelling()
    solution1()
    solution2()
    solution3()
}

private fun noCancelling() = runBlocking<Unit> {
    val job = launch(Dispatchers.Default){
        repeat(10){
            println("this is $it")
            Thread.sleep(100)
        }
    }

    delay(250)
    println("Cancelling coroutine!")
    job.cancel()
}

private fun solution1() = runBlocking<Unit> {

    val job = launch(Dispatchers.Default){
        repeat(10){
            ensureActive()
            println("this is $it")
            Thread.sleep(100)
        }
    }

    delay(250)
    println("Cancelling coroutine!")
    job.cancel()
}



private fun solution2() = runBlocking<Unit> {

    val job = launch(Dispatchers.Default){
        repeat(10){
            yield()
            ensureActive()
            println("this is $it")
            Thread.sleep(100)
        }
    }

    delay(250)
    println("Cancelling coroutine!")
    job.cancel()
}

private fun solution3() = runBlocking<Unit> {
    val job = launch(Dispatchers.Default){
        repeat(10){
            if(isActive) {
                println("this is $it")
                Thread.sleep(100)
            }else{
                withContext(NonCancellable){
                    delay(100)
                    println("Cleaning up...")
                    throw CancellationException()
                }
            }
        }
    }

    delay(250)
    println("Cancelling coroutine!")
    job.cancel()
}

