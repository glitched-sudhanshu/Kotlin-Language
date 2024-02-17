fun main() {
    var x = 10
    while(x>0){
        println("Number is $x")
        x--;
    }
    println("X is $x")
    do {
        println("Do while loop - $x")
        x++
    }while (x<=0)
    println("X is $x")
}