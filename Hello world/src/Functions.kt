fun main() {
    println(add(4,5))
    showDivider()
    val res = evenOrOdd(5)
    val res2 = evenOrOdd(4)
    println(res)
    showDivider("Sudhanshu")
    println(res2)
    showDivider()
}

//inline function
fun add(a: Int, b: Int) = a + b

fun evenOrOdd(a: Int): String{ //parameters
    return if(a%2 == 0) "Even" else "Odd"
}

//default arguments
fun showDivider(showMessage: String = ""): Unit{
    if(showMessage.isNotBlank()) print(showMessage)
    println("----------------------")
}

