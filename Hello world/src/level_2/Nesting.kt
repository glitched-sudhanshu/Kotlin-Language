package level_2

fun main() {

    val obj = Outer()
    obj.i

    val nested = Outer.Nested()
    nested.test()

//    it is not available
//    obj.test

//    can;t call like above, we need to make an object of Outer Class
//    val inner = Outer.InnerNested()

    val inner = Outer().InnerNested()
    inner.innerTest()
}


class Outer{

    var i = 0

    class Nested{
        var j = 0
        fun test(){
//            can't access i from outer class
//            println("I am a nested class $i")
            println("I am a nested class")
        }
    }

    inner class InnerNested{

        var inner = 0
        fun innerTest(){
            //can access i from outer class
            println("I am a inner class $i")
        }
    }
}