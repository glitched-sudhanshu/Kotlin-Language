import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("main starts")
    joinAll(
        async { coroutines(1, 500) },
        async { coroutines(2, 300) },
        async {
            repeat(5){
                println("other task is working on ${Thread.currentThread().name}")
                delay(100)
            }
        }
    )
    println("main ends")
}

suspend fun coroutines(number: Int, delay: Long) {
    println(Thread.currentThread().name)
    println("Coroutine $number starts")
    delay(delay)
    println("Coroutine $number ends")
}