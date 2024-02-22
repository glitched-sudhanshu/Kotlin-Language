package level_2

fun main() {
    var gender: String = "Male" //"Female", "Others"
    var gender2: String? = null
    var isAdult: Boolean? = true


    if(gender2 != null){
        println(gender2.toUpperCase())
    }

    println(gender2?.toUpperCase())

    gender2?.let {
        println("Line 1")
        println("Line 2 $gender2")
        println("Line 3 $it")
    }

    //elvis operator
    var selectedValue = gender2 ?: "NA"

    //not-null asserted operator
    var value = gender2!!.toUpperCase()
}