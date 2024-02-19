fun main() {
    val circle : Shape = Circle(4.0)
    val square : Square = Square(4.0)
    val parSquare : Shape = Square(5.0)
    val shape : Shape = Shape()

    //can't do this
//    val childCircle : Circle = Shape()

    println(circle.area())
    println(square.area())
    println(square.perimeter())

    println(parSquare.area())

    //can't perform this.
    //parent can hold reference to it's child class and will call the function based on the object of the child class.
    //parent can call methods of child class that are common; not exclusive.
//    println(parSquare.perimeter())

    //benefit of polymorphism
    allAreas(arrayOf(circle, square, parSquare, shape))
}

fun allAreas(list: Array<Shape>)
{
    println("areas")
    list.forEach {
        println(it.area())
    }
}

open class Shape()
{
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape()
{
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double) : Shape()
{
    override fun area(): Double {
        return side * side
    }

    fun perimeter(): Double = 4*side
}