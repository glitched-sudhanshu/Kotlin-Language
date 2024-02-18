import kotlin.math.pow

fun main() {
    //named arguments, explicitly defining the param's value
    println(addition(a = 3,b = 5))
    println(addition(b = 3.0, a = 5.0))

    //storing function in a variable
    var fn: (Double, b: Double) -> Double = ::addition
    println(fn(5.0,6.0))

    fn = ::power
    println(fn(3.4, 2.1))
}

fun addition(a: Int, b: Int) = a+b

fun addition(a: Double, b: Double) = a+b

fun power(a: Double, b: Double) = a.pow(b)

