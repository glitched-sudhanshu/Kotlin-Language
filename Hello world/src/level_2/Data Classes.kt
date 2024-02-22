package level_2

fun main() {
    val fam1 = Family(5, "Pandey")
    val fam2 = Family(5, "Pandey")
    val famData1 = FamilyData(5, "Pandey")
    val famData2 = FamilyData(5, "Pandey")

    println("fam1 - ${fam1.hashCode()}      fam2 - ${fam2.hashCode()}          isEqual - ${fam1 == fam2}")

    //no need to override hashCode and isEqual function
    println("famData1 - ${famData1.hashCode()}      famData2 - ${famData2.hashCode()}          isEqual - ${famData1 == famData2}")

    val f3 = famData1.copy(members = 2)
    // notice alr formatted output
    println(f3)

    //destructuring of object
    //ala component n functions
    val (members, surname) = f3
    println(members)
    println(surname)
    println(f3.component1())
    println(f3.component2())


}

class Family(val members: Int, val title: String){
}

data class FamilyData(val members: Int, val title: String)