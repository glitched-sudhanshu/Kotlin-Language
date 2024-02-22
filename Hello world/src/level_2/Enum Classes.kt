package level_2

fun main() {
    val gen = Gender.MALE
    println(gen)

    val day = Day.FRIDAY
    println(day)

    for (i in Day.entries){
        println(i)
    }

    day.printFormattedDay()
}

enum class Gender{
    MALE,
    FEMALE,
    OTHERS
}

enum class Day(val number: Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);
    // ; to end the list

    fun printFormattedDay() = println("Day is $this")
}