package level_2

import kotlin.math.pow

fun main() {
    var fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(3.0,4.0))

    calculator(4.0, 6.0, ::sum)
    //higher order function -> Fun that accepts funs as arguments or returns funs or both
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun power(a: Double, b:Double): Double{
    return a.pow(b)
}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double){
    val  result = gn(a, b)
    println(result)
}

fun hello(a: Int): Unit{

}