fun main() {
    val smartPhone = SmartPhone()
    smartPhone.name = "SmartPhone"
    println("${smartPhone.name}")
    smartPhone.powerOff()
    val basicPhone = BasicPhone()
    basicPhone.name = "BasicPhone"
    println("${basicPhone.name}")
    basicPhone.powerOff()

}

open class Phone{
    open var name: String = ""
        get() {
            return "$field parent"
        }
    var type: String = ""
    var volume: Int = 10

    fun makeCall(){}
    fun display(){}
    open fun powerOff(){
        println("Called from parent")
    }
    fun getDeviceInfo(){}
}

open class BasicPhone: Phone(){
    fun getScreenInfo(){}
}

class SmartPhone : Phone() {

    override var name: String = "Smart Phone"
        get() {
            super.name
//            println("$field child")
            return "$field child"
        }

    override fun powerOff(){
        super.powerOff()
        println("Called from child")
    }

    fun playMovie() {}
    fun takePicture() {}
    fun getLocation() {}
}

class OldPhone() : BasicPhone(){

}