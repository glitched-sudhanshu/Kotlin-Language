fun main() {
    val car = Automobile(name = "Car", 4, 5, true)
    println("${car.name} ${car.tyres} ${car.maxSeating}")
    val car2 = Automobile("Car", false)
    println("${car2.name} ${car2.tyres} ${car2.maxSeating} ${car2.airBags}")
    val empty = Empty()
    println(empty)
    val me = Me()
    println("${me.name}  ${me.age}")
    val sakshi = Person(nameParam = "Sakshi", ageParam = 22)
    println("${sakshi.name}  ${sakshi.age}")
    val sudhanshu = Person()
    println("${sudhanshu.name}  ${sudhanshu.age}  ${sudhanshu.canVote}")

}

//if we add val/var with param, it becomes a property of that class; o/w it remains just a param. e.g hasAirBags here
class Automobile(val name: String, val tyres: Int, val maxSeating: Int, hasAirBags: Boolean) {

    init {
        println("It is executed")
    }

    constructor(nameParam: String, hasAirBags: Boolean) : this(name = nameParam, 4, 5, hasAirBags = hasAirBags){
        airBags = hasAirBags
        drive()
    }

    var airBags = hasAirBags
    fun drive() {
        println("Drive is called")
    }
    fun applyBreaks() {}
}

class Empty {}

class Me() {
    //default value
    val name: String = "Sudhanshu"
    var age: Int = 21
}

class Person(nameParam: String = "Sudhanshu", ageParam: Int = 21) {
    val name: String = nameParam
    var age: Int = ageParam
    var canVote: Boolean = age > 18
}