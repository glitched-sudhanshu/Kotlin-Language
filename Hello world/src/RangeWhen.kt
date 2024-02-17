fun main() {
    val number = 15
    val res = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "Number not found"
    }
    println(res)

    val result = 15 in 1 until 16
    println(result)
}