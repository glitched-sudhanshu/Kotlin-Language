fun main() {
    val x = 10
    val y = 11

    val res = if(x>y){
        "$x is greater than $y"
    }
    else if(x < y){
        "$x is less than $y"
    }
    else {
        "$x is equal to $y"
    }

    println(res)
}