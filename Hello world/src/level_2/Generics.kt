package level_2

fun main() {
    val obj = IntContainer(3)
    obj.getValue()
    val iContainer = Container<Int>(3)
    iContainer.getValue()

    add(1,2,3,4,5,5)
    add(1,2,3,1,3)
}

fun add(vararg value: Int){
    var sum = 0
    for (i in value){
        sum += i
    }
    println(sum)
}


class Container<T> (var data: T){
    fun setValue(value: T){
        data = value
    }

    fun getValue(): T{
        return data
    }
}

// need to write code for all types exclusively
class IntContainer(var data: Int){
    fun setValue(value: Int){
        data = value
    }

    fun getValue(): Int{
        return data
    }
}

class StringContainer(var data: String){
    fun setValue(value: String){
        data = value
    }

    fun getValue(): String{
        return data
    }
}