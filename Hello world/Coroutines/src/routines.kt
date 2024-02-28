fun main() {
    println("main starts")
    routines(1, 500)
    routines(2, 300)
    println("main ends")
}

fun routines(number: Int, delay: Long){
    println("Routine $number starts")
    Thread.sleep(delay)
    println("Routine $number ends")
}