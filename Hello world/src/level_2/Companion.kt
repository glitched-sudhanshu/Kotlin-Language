package level_2

fun main() {
    val pizza1 = Pizza.Factory.create("Tomato")
    println(pizza1.toString())

    //Here now we are calling via Factory reference - don't want to use Factory ref.
    // Now, after defining companion
    val pizza2 = Pizza.create("Peppy Paneer")

    //If we want to call this create method everytime someone wants a Pizza
    // for that we will mark the constructor are private

    val pizza3 = Pizza.create("Macoroni")
    //Here since we marked the constructor private, we are forcing it to make an object only via create method
}


class Pizza private constructor(val type: String, val topping: String)
{
    companion object Factory{
        fun create(pizzaType: String) : Pizza{
            return when(pizzaType){
                "Tomato" -> Pizza("Tomato", "Tomato Cheese")
                "Peppy Paneer" -> Pizza("Paneer Farm", "Tomato Cheese Paneer Corn")
                else -> Pizza("Macoroni", "Macoroni Pasta Noodles Cheese")
            }
        }
    }

    override fun toString(): String {
       return "Type - $type; Toppings - $topping"
    }
}

class TestObject{
    //we can also create objects within a class. In this case, the reference of these
    //objects will be held by the CLASS itself, not via the objects of the class.


    //companion objects are made to fulfil the use of static methods of JAVA.
    //NOTE: by default the implementation is not as static method.
    //We will have to mark the function as @JvmStatic
    companion object A{
        @JvmStatic
        fun f() = println("This is function f")

    }


    //can have multiple objects; but only one companion object
    object B{
        @JvmStatic
        fun g() = println("This is function g")
    }

    object C{

    }
}