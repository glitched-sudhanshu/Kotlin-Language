import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//problem with this approach is that to store the result
//we are using shared mutable state
//in context of concurrent programming it should always be avoided. coz of reader-writer problem
fun main() {
    runBlocking {
        val startTime = System.currentTimeMillis()
        val mutableResult = mutableListOf<String>()
        val job1 = launch {
            val res = networkCall(1)
            mutableResult.add(res)
        }
        val job2 = launch {
            val res = networkCall(2)
            mutableResult.add(res)
        }
        job1.join()
        job2.join()
        println("$mutableResult : ${elapsedMills(startTime)}")
    }
}