import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val variable = arrayOf("Hello", "Hi", "How are you")

    for ((index, value) in variable.withIndex())
        println(value)


    val numbers = arrayOf(1, 5, 10, 15, 20)
    for (x in numbers) {
        println(x)
    }

    val narsalar = arrayOf("Telefon", "Kompyuter", "Sichqoncha")
    println(narsalar[0])
    narsalar[0] = "Quvvatlagich"

    for (i in 10 downTo  0 step 3)
        println(i)

    repeat(5) {
        println("Salom")
    }

    for (b in 0..5) {
        println("Salom")
    }

    repeat(3) {
        for (a in 12 downTo 0 step 4)
            print(a)
    }



}