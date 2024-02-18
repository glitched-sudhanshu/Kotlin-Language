fun main() {
    val ob = Calculator()
    println(ob.add(2,3))
    println(ob.multiply(3,4))
    ob.message = "kardia na initialize"
    println(ob.message)


    val person = People("Sudhanshu", 22, "r02.sudhanshu@gmail.com")

    println("${person.name}  ${person.age}")
    person.age = 13
    println("${person.name}  ${person.age}")
    person.age = -12
    println("${person.name}  ${person.age}")

}

class Calculator{
    lateinit var message: String
    fun add(a: Int, b: Int) = a + b + 6

    fun multiply(a: Int, b: Int) = a*b
}

class People(nameParam: String, ageParam: Int, emailParam: String){

    //custom getter
    var name: String = nameParam
        get() {
            println("$field getter is called.")
            return field.toUpperCase()
        }


    //custom setter
    var age: Int = ageParam
        set(value) {
            if(value>0) field = value
            else println("Age cannot be -ve")
        }

    //default getter and setter
    var email: String = emailParam
        get() { return field}
        set(value) {field = value}

}