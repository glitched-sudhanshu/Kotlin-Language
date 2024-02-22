package level_2

fun main() {
    //in kotlin, anything that we are writing in {} is a lambda
    //basically, a function with no name

    var fn: (a: Double, b: Double) -> Double = ::sum
    val lambda1 = {x: Int, y: Int -> x + y}

    //the last line of a multiline lambda would be it's return type
    val multilineLambda = {
        println("Hello world")
        val a = 2+3
        a
    }
    println(multilineLambda())
    val multilineLambda2 = { a: Int, b : Int ->
        println("Hello world")
        val x = a+ b
        x
    }
    println(multilineLambda2(3,4))

    val singleParamLambda = {x: Int -> x*x}
    //since we are explicitly adding the type, no need to add the type while writing the lambda
    val lambda2: (Int) -> Int = {x -> x*x}
    val moreSimplify: (Int) -> Int = {it * it}

    val sayHi = {msg: String -> println("hello $msg") }
    val sayHi2: (String) -> Unit = {msg -> println("hello $msg") }

}

fun sum(a: Int, b: Int): Int {
    return a + b
}