import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {


    runBlocking {
        launch {
            networkRequest()
            println("result received")
        }
        println("end of runBlocking")
    }

    runBlocking {
        val job = launch {
            networkRequest()
            println("result received")
        }
        //this suspends the current coroutine and wait for job to join
        job.join()
        println("end of runBlocking")
    }

    runBlocking {
        val job = launch(start = CoroutineStart.LAZY) {
            networkRequest()
            println("result received")
        }
        delay(3000)
        job.start()
        println("end of runBlocking")
    }

}

suspend fun networkRequest(): String {
    delay(500)
    return "Result"
}