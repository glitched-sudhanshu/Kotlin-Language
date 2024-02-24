package level_2

fun main() {
    val emp = Employee()
    println(emp)

    emp.age = 22
    emp.name = "Harry"
    println(emp)

    //returns the object
    emp.apply {
        age = 15
        name = "Kundru"
    }
    println(emp)


    println(emp.name)
    println(emp.age)
    //returns the last line of the let block
    emp.let {
        println(it.name)
        println(it.age)
    }


    //returns the last line of the let block
    with(emp){
        age = 55
        name = "Aman"
    }

    //returns the last line of the let block
    emp.run {
        age = 43
        name = "Slahhu"
    }
}

data class Employee(var name: String = "", var age: Int = 12)