fun main() {
    val above70 = false
    val knowsProgramming = true

    // && AND
    val calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    // || OR
    val mayCallForInterview = above70 || knowsProgramming
    println(mayCallForInterview)

    //short-circuiting
    var j = 10
    var i = 11
    //j++ is not executed as TRUE is returned already
    val result = i==10 || j++ == 11
    println(i)
    println(j)

    val res = i==110 || j++ == 11
    println(i)
    println(j)
}