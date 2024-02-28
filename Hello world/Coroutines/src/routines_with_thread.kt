import kotlin.concurrent.thread

fun main() {
    println("main starts")
    routinesWithThread(1, 500)
    routinesWithThread(2, 300)
    Thread.sleep(1000)
    println("main ends")
}

fun routinesWithThread(number: Int, delay: Long){
    thread {
        println("routine $number on thread ${Thread.currentThread().name}")
        println("Routine $number starts")
        Thread.sleep(delay)
        println("Routine $number ends")
    }
}