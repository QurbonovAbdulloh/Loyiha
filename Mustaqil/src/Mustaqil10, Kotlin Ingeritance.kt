open class MyParentClass {
    val x = 5
}

class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x)
    }
}

fun main(args: Array<String>) {

    val myObj = MyChildClass()
    myObj.myFunction()
}