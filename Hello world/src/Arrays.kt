fun main() {
    var arr = arrayOf("One", "Two", "Three")
    var arr1 = arrayOf(1,2,3)
    var arr2 = arrayOf<Int>(5,6,7)
    println(arr[0])
    println(arr.get(1))
    println(arr[2])
    arr.set(0,"Start")
    println(arr[0])

    for (i in arr1){
        println(i)
    }

    for((i,e) in arr2.withIndex()){
        println("$i - $e")
    }
}