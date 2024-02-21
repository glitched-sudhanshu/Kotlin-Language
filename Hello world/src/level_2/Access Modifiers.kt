package level_2

//aka visibility modifiers

fun main() {
    val objA = A()
    val objB = B()
    objA.p
    objA.s
    //these two are not valid
//    objA.q
//    objA.r


    objB.p
    objB.s
    //these two are not valid
//    objB.q
//    objB.r
}

open class A{
    public var p = 10
    private var q = 20
    internal var s = 40
    protected var r = 30
}

class B: A(){
    fun test()
    {
        println(p)
//        println(q) not valid, since pvt
        println(s)
        println(r)
    }
}