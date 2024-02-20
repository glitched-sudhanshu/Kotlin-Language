package level_2

fun main() {
    val triangle = Triangle(2.0,3.0)
    val rhombus = Rhombus(4.0, 6.0)
    allClonesAndDrags(arrayOf(triangle, rhombus))
}

fun allClonesAndDrags(array: Array<Draggable>){
    array.forEach {
        println("CLONE")
        println("${it.clone()}      ${it.cloning()}    ${it.cloned()}")
        println("DRAG")
        println("${it.drag()}      ${it.dragging()}")
    }
}

interface Cloneable{
    fun clone()
    fun cloning() = println("Cloning")
    fun cloned()
}

interface Draggable : Cloneable {
    fun drag()

    override fun cloning() {
        super.cloning()
        println("Cloning inside Draggable")
    }

    override fun cloned() {
        println("Cloned inside Draggable")
    }

    fun dragging() = println("Dragging")
}

abstract class Shape : Draggable{
    override fun cloned() {
        super.cloned()
        println("Cloned inside Shape Class")
    }
    abstract fun area() : Double
}

class Triangle(val base: Double, val height: Double) : Shape(){
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun clone() {
        println("Clone Triangle")
    }

    override fun drag() {
        println("Drag Triangle")
    }

    override fun dragging() {
        println("Dragging Triangle")
    }
}

class Rhombus(val d1: Double, val d2: Double): Shape()
{
    override fun area(): Double {
        return d1*d2
    }

    override fun clone() {
        println("Clone Rhombus")
    }

    override fun drag() {
        println("Drag Rhombus")
    }
}

