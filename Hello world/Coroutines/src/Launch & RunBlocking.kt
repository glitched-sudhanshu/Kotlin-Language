import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //try one by one
//    launchTest()
//    runBlockingTest()
    launchAndRunBlockingTest()
}

fun launchAndRunBlockingTest(){
    runBlocking{
        launch {
            println("Inside coroutine start")
            delay(500)
            println("Inside coroutine end")
        }
        println("main ends")
    }
}

fun launchTest() {
    GlobalScope.launch {
        println("Inside coroutine start")
        delay(500)
        println("Inside coroutine end")
    }
    println("main ends")
}

fun runBlockingTest() {
    runBlocking {
        println("Inside coroutine start")
        delay(500)
        println("Inside coroutine end")
    }
    println("main ends")
}