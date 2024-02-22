package level_2

fun main() {
    val arr = arrayOf(1,2,3)

    try {
        println(arr[2])
    }catch (e: Exception){
        println(e.message)
    }finally {
        println("Execution completed")
    }

    createUserList(5)
    createUserList(113)
}

fun createUserList(count: Int) {
    if(count<0) throw IllegalArgumentException("Count must be greater than 0 and less than 100")
    else if(count > 100) throw Exception("Count must be greater than 0 and less than 100")
    else println("User list of size $count created")
}
