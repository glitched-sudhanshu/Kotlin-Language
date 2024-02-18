fun main() {

    val mustang: Car = Car("Mustang", "petrol", 250)
    val beetle = Car("Beetle", "diesel", 173)

    println(beetle.name)
    println(beetle.type)
    println(beetle.kmRan)

    mustang.driveCar()
}

class Car(val name: String, val type: String, var kmRan: Int){
    fun driveCar(){
        println("$name is driving")
    }

    fun applyBrakes(){
        println("Applied Breaks")
    }
}