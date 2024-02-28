
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() = runBlocking {

//    can shoot 1mn coroutines easily
    repeat(1_00_000){
        launch {
            delay(3000)
            print(".")
        }
    }

    //can't shoot 1mn threads. execution is also very slow
    repeat(1_00_000){
        thread {
            Thread.sleep(3000)
            println(it)
        }
    }


}