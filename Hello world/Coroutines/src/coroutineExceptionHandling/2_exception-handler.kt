import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val scope = CoroutineScope(Job() + CoroutineExceptionHandler { _, throwable ->
        println("$throwable is caught!")
    })
//    method1(scope)
//    method2(scope)
    method3()
//    method4()

}

private fun method1(scope: CoroutineScope) {

    scope.launch {
        throw IllegalArgumentException()
    }
    Thread.sleep(100)
}

private fun method2(scope: CoroutineScope) {
    scope.launch(CoroutineExceptionHandler { _, throwable ->
        println("$throwable is caught in 2nd one!")
    }) {
        throw IllegalArgumentException()
    }
    Thread.sleep(100)
}

//will fail coz installing handler in child, which will not catch the exception
private fun method3() {
    val scope = CoroutineScope(Job())
    scope.launch {
        launch(CoroutineExceptionHandler { _, throwable ->
            println("$throwable is caught in 2nd one!")
        }) { throw IllegalArgumentException() }
    }
    Thread.sleep(100)
}

//correct impl for nested coroutines
private fun method4() {
    val scope = CoroutineScope(Job())
    scope.launch(CoroutineExceptionHandler { _, throwable ->
        println("$throwable is caught in 2nd one!")
    }) {

        launch() { throw IllegalArgumentException() }
    }
    Thread.sleep(100)
}