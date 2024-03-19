package coroutineCancellation

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {

    val countingJob : Job = launch {
        counting()
    }
    delay(250)
    println("Cancelling coroutine!")
    countingJob.cancel()
}

private suspend fun counting() {
    repeat(10) {
        println("this is $it")
        delay(100)
    }
}