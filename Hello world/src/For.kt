fun main() {
    for (i in 1..5){
        println("number is $i")
    }

    //step
    println("--------------------------------")
    //step cannot be -ve
    for (i in 1..7 step 2){
        println("number is $i")
    }

    println("--------------------------------")

    for (i in 10 downTo 0 step 2){
        println("number is $i")
    }
    println("--------------------------------")
}