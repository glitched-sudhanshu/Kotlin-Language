import kotlinx.coroutines.*

fun main() {
    coroutineScopeUseCase1()
//    coroutineScopeUseCase2()
}

//we want 1-2 to execute parallel and after that 3
private fun coroutineScopeUseCase1() {
//    useCase1Solution1()
//    useCase1Solution2()
    useCase1BestSolution()
}

private fun useCase1Solution1() {

    //solution 1
    runBlocking {
        val job1 = launch {
            println("1 starts")
            delay(100)
            println("1 ends")
        }
        val job2 = launch {
            println("2 starts")
            delay(100)
            println("2 ends")
        }
        job1.join()
        job2.join()
        launch {
            println("3 starts")
            delay(100)
            println("3 ends")
        }
    }
    Thread.sleep(1000)
}

private fun useCase1Solution2() {


    //solution 2
    runBlocking {
        launch {
            launch {
                println("1 starts")
                delay(100)
                println("1 ends")
            }
            launch {
                println("2 starts")
                delay(100)
                println("2 ends")
            }
        }.join()

        launch {
            println("3 starts")
            delay(100)
            println("3 ends")
        }
    }
    Thread.sleep(1000)
}

private fun useCase1BestSolution() {

    //solution 2
    runBlocking {
        coroutineScope {
            launch {
                println("1 starts")
                delay(100)
                println("1 ends")
            }
            launch {
                println("2 starts")
                delay(100)
                println("2 ends")
            }
        }

        launch {
            println("3 starts")
            delay(100)
            println("3 ends")
        }
    }
    Thread.sleep(1000)

}

private fun coroutineScopeUseCase2() {
    runBlocking {
//        doSomeTasksImplementation1()
        doSomeTasksImplementation2()
        launch {
            println("3 starts")
            delay(100)
            println("3 ends")
        }
    }
}

//but there is a principle in kotlin coroutines, that concurrency should be explicit, not default.
//but in this implementation it will always run in parallel to the code where it is used.
//coz it won't give user the choice whether he or she wants to run it syncly or asyncly
private fun CoroutineScope.doSomeTasksImplementation1() {

    launch {
        println("1 starts")
        delay(100)
        println("1 ends")
    }
    launch {
        println("2 starts")
        delay(100)
        println("2 ends")
    }
}

private suspend fun doSomeTasksImplementation2() {
    coroutineScope {
        launch {
            println("1 starts")
            delay(100)
            println("1 ends")
        }
        launch {
            println("2 starts")
            delay(100)
            println("2 ends")
        }
    }
}