package level_2

fun main() {
    val triangle = Triangle(2.0,3.0)
    val player = Player("Ranjan")
    val array = arrayOf(triangle, player)

    array.forEach {
        //TYPE CHECKING
        if(it is Triangle){
            println(it.area())
        }else{
            //TYPE CASTING
            (it as Player).sayMyName()
        }
    }
}