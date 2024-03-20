import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
//    method1()
//    method2()
//    method3()
    method4()
    Thread.sleep(1000)
}

private fun method1() {
    val scope = CoroutineScope(Job() + CoroutineExceptionHandler
    { _, _ -> println("Exception is caught!") })
    scope.async {
        delay(250)
        throw IllegalArgumentException()
    }
    Thread.sleep(500)
}

private fun method2() {
    val scope = CoroutineScope(Job() + CoroutineExceptionHandler
    { _, _ -> println("Exception is caught!") })
    val result = scope.async {
        delay(200)
        throw IllegalArgumentException()
    }
    scope.launch {
        result.await()
    }
    Thread.sleep(500)
}

private fun method3() {
    val scope = CoroutineScope(Job() + CoroutineExceptionHandler
    { _, _ -> println("Exception is caught!") })
    val result = scope.async {
        delay(250)
        throw IllegalArgumentException()
    }

    scope.async {
        result.await()
    }
    Thread.sleep(500)
}

//exception catched but still thrown upar
private fun method4() {
    val scope = CoroutineScope(Job())
    scope.launch {
        val result = async {
            delay(250)
            throw IllegalArgumentException()
        }
        try {
            result.await()
        } catch (e: Exception) {
            println("Exception caught!")
        }
    }
    Thread.sleep(1000)
}