import kotlinx.coroutines.*

fun main() {
    println("Job object of GlobalScope: ${GlobalScope.coroutineContext[Job]}")

    var job1 : Job? = null
    var job2 : Job? = null
    GlobalScope.launch{
        val scope = CoroutineScope(Dispatchers.Default)
        job1 = scope.launch {
            println("Coroutine 1")
            delay(100)
            job2 = launch {
                println("Coroutine 2")
                delay(100)
                println("Coroutine 2 ends")
            }
            println("Coroutine 1 ends")
//            Thread.sleep(1000)
            println("job ${job1?.children?.contains(job2)}")
            println("job ${job2?.children?.contains(job1)}")
        }
    }
    Thread.sleep(2000)
//    println("global ${x.children.contains(job)}")
}