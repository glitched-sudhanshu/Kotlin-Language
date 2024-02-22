package level_2

fun main() {
    val tile : Tile = Red("Strong", 30)
    val points = when(tile){
        is Red -> tile.points * 2
        is Blue -> tile.points * 2
    }
    println(points)
}

//basically, sealed class and enums are different in a way that, for enums
//it is same for all the set of values, but for sealed class, we can have exhaustive
//states for each value

sealed class Tile

class Red(val type: String, val points: Int): Tile()
class Blue(val points: Int): Tile()