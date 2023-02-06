class Car1(var brand: String, var model: String, var year: Int) {

    fun drive() {
        println("Wrooom!")
    }

    fun speed(maxSpeed: Int) {
        println("Max speed is: $maxSpeed")
    }

}

fun main(args: Array<String>) {
    val c1 = Car1("Ford","Mustang", 1969)

    c1.drive()
    c1.speed(200)
}