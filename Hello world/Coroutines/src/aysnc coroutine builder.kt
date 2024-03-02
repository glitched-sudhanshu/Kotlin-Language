import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val startTime = System.currentTimeMillis()
        val deferred1 = async {
            val res = networkCall(1)
            res
        }
        val deferred2 = async {
            val res = networkCall(2)
            res
        }
        val result = listOf(deferred1.await(), deferred2.await())
        println("$result : ${elapsedMills(startTime)}")
    }
}