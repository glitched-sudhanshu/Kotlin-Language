import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val startTime = System.currentTimeMillis()
    runBlocking {
        val res1 = networkCall(3)
        println("$res1 : ${elapsedMills(startTime)}")
        val res4 = networkCall(4)
        println("$res4 : ${elapsedMills(startTime)}")
        launch {
            val res2 = networkCall(1)
            println("$res2 : ${elapsedMills(startTime)}")
        }
        launch {
            val res3 = networkCall(2)
            println("$res3 : ${elapsedMills(startTime)}")
        }
    }
    Thread.sleep(200)
    println("main ends ${elapsedMills(startTime)}")
}


suspend fun networkCall(number: Int): String{
    delay(500)
    return "Result $number"
}

fun elapsedMills(startTime: Long) = System.currentTimeMillis() - startTime