package Massiv

fun main(args: Array<String>) {

    val variable3 = arrayOf("Hello", "Hi", "How are you?")

    for (i in variable3) {
        println(i)
    }


    val variable1 = arrayOf("Hello", 12, 20.0, 'a')

    val variable2 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (i in variable2) {
        println(i)
    }

    val variable4 = "Hello"
    for (h in 0 until variable4.length) {
        println(variable4[h])
    }

    val variable5 = "Hello"
    for (d in variable5) {
        for (element in variable5) {
            println(variable5)

        }
    }

    val variable = arrayOf("Hello", "Hi", "How are you?")

    for ((index, value) in variable.withIndex()) {
        println(index)
        println(value)

    }


}