package level_2

fun main() {
    val nums = listOf(1,2,3,4,5,6)
    println(isOdd(2))
    println(isOdd(3))

    val list = nums.filter(::isOdd)
    println(list)

    val list2 = nums.filter(fun(a: Int): Boolean{
        return a%2 != 0
    })
    println(list2)

    val list3 = nums.filter { it%2 != 0 }
    println(list3)

    val userList = listOf(TestUser(1, "ranjan"), TestUser(2, "Pandey"), TestUser(3, "Sharma"))
    println(userList)
    println(userList.filter { it.id<=2 })


    //for each
    userList.forEach{ println("${it.name}  is ${it.id}") }


    //map
    println(userList.map { PaidUser(it.id, it.name, "Paid") })
}

fun isOdd(a: Int) = (a%2!=0)

data class TestUser(val id: Int, val name: String)
data class PaidUser(val id: Int, val name: String, val type: String)