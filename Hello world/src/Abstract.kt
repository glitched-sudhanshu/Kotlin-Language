fun main() {
    val triangle = Triangle(2.0,3.0)
    val rhombus = Rhombus(4.0, 6.0)
    allSides(arrayOf(triangle, rhombus))
    println(triangle.area())
    println(triangle.perimeter())
    println(rhombus.area())
    println(rhombus.perimeter())
}

private fun allSides(array: Array<Polygon>){
    println("---All Sides---")
    array.forEach {
        println(it.noOfSides())
    }
}

//created a class which has no abstract fun. It is generally done so that no object of A can be created.
//In real life scenarios, it is done when we're trying to create a Base class.
abstract class A{
    fun x(){
        println("Function of A")
    }
}

abstract class Polygon{
    abstract fun area(): Double
    open fun perimeter() = println("This is polygon class")
    fun noOfSides() = 0
}

class Triangle(val base: Double, val height: Double) : Polygon(){
    override fun area(): Double {
        return 0.5 * base * height
    }

}

class Rhombus(val d1: Double, val d2: Double): Polygon()
{
    override fun area(): Double {
        return d1*d2
    }

    override fun perimeter() = println("This is Rhombus class")
}