fun main(args: Array<String>) {
    //Now, score will be of Type INT, this is called Type Inference in Kotlin
    var score = 8
    println(score)
    score = 10
    println(score)
    val message = "This is a VAL"
    println(message)
//    message = "This can't be reassigned"

//This is invalid bcoz we are changing the datatype from INT to DOUBLE. This is called Type Check in Kotlin
//    score = 3.14

    //Basic datatypes
    var scores: Int = 100
    var isCold : Boolean = false
    var temperature: Double = 3.22
    var alphabet : Char = 'A'
}