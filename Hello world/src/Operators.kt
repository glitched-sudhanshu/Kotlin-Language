fun main() {
    var i = 12
    val j = 3

//arithmetic
    println(i+j)
    println(i-j)
    println(i%j)
    println(i*j)
    println(i/j)

    //relational
    println(i==j)
    println(i<j)
    println(i<=j)
    println(i>j)
    println(i>=j)
    println(i!=j)

    //post-pre increment
    println(i++)
    println(++i)

    //post-pre decrement
    println(--i)
    println(i--)

    i=13
//    13 - 14 + 14
// memory    14 - 13 + 14
    println(i++ - i-- + ++i)
}