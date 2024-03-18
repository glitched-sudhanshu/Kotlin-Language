import kotlinx.coroutines.*

fun main() {
    nestedChild()
    breakingHierarchy()
}

private fun nestedChild()
{
    val parentJob = Job()
    val parentScope = CoroutineScope(Dispatchers.Default + parentJob)
    var nestedJob : Job? = null
    val childJob = parentScope.launch {
        nestedJob = launch {
            println("This is nested coroutine!")
            delay(1000)
        }
        println("This is coroutine!")
        delay(1000)
    }
    Thread.sleep(1000)
    println(parentJob.children.contains(childJob)) //true
    println(childJob.children.contains(nestedJob)) //true
}

private fun breakingHierarchy(){
    val parentJob = Job()
    val parentScope = CoroutineScope(Dispatchers.Default + parentJob)
    val passedJob = Job()
    val childJob = parentScope.launch(passedJob) {
        println("This is coroutine!")
        delay(1000)
    }
    println(parentJob.children.contains(childJob)) //false

}