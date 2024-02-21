package level_2

fun main() {
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.display()

    // using object keyword for anonymous inner class object declaration
    val testObj = object : Test(), TestInterface{
        override fun testing() {
            super.testing()
            println("This is test obj")
        }

        override fun interfaceFunction() {
            println("This is a function")
        }
    }
    val testObj2 = object{
        fun testing() {
            println("This is test obj")
        }
    }
    testObj.testing()
}

object SharingWidget{
    private var twitterLikes = 0
    private var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFbLikes() = fbLikes++
    fun display() = println("Twitter - $twitterLikes  == Facebook- $fbLikes")
}

interface TestInterface {
    fun interfaceFunction()
}

open class Test{
    val x = 2
    open fun testing() = println("This is test class")

}

object X : Test(){

}

//not valid
//object Y : X{}