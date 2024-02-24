package level_2

fun main() {
    //extension fun
    println("Hello Sudhanshu Ranjan".formattedString())

    calculateTimeAndRun { loop(1000) }
}

//we can;t access pvt. members of the class
fun String.formattedString(): String{
    return "-----------$this--------------"
}

//helps to improve performance
inline fun calculateTimeAndRun(fn: () -> Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time take ${end-start} ms")
}

fun loop(n: Long){
    for(i in 1..n ){
        //
    }
}