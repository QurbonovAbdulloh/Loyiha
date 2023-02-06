fun main(args: Array<String>) {

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mercedes-Benz", "Volga")
    cars[0] = "Opel"

    println(cars.size)
    println(cars[1])
    println(cars[0])
    println(cars.indices)
    println(cars.lastIndex)

    if ("BMW" in cars) {
        println("Bu mashina mavjud!")
    } else {
        println("Bu mashina mavjud emas.")
    }

    for (x in cars) {
        println(x)
    }

    val numbers = arrayOf(1, 5, 10, 15, 20)
    for (x in numbers) {
        println(x)
    }

    for (i in 1..5) {

        println(i)

    }

    for (b in 15 downTo 0) {

        println(b)

    }

    val number = 10

    for (a in 0..number step 2) {

        println(a)

    }

    val variable = "Hello"
    println(variable[3])


}