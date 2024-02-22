package level_2

fun main() {
    //immutable list is almost same as an array, with the only difference that
    //in an array, we can change the values of any index
    //but in an immutable list, we can't even change the values of the list.
    //one application of this could be, in a multi threaded scenario
    // we don't want any one to change any value, and use it as it is.
    val nums = listOf(1,2,3)

    println(nums.indexOf(2))
    println(nums[2])
    println(nums.contains(5))


    val mnums = mutableListOf(1,2,3)
    println(nums.indexOf(2))
    println(nums[2])
    println(nums.contains(5))
    mnums[2] = 6
    println(nums[2])
    mnums.removeAt(2)
    println(mnums.size)

    val list2 = listOf(4,5,6)

    mnums.addAll(list2)
    println(mnums)


    val students = mutableMapOf<Int, String>(129 to "Shubham", 131 to "Tushar")
    students[134] = "Sudhanshu"
    students.put(133, "Sparsh")
    students.put(132, "Sourav")

    // not present, that's why null
    println(students[1])
    println(students[133])
    println(students)


    for ((key, value) in students){
        println("$key is $value")
    }

    students.forEach{
        it.key
        it.value
    }

    val map = mapOf<Int, String>(1 to "Hey", 2 to "Bye")
    println(map)

    mnums.addAll(students.keys)
    println(mnums)
}

