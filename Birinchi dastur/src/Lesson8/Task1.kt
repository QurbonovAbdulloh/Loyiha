package Lesson8

import java.util.*

fun main(args: Array<String>) {

    //Vazifa1 -> 1.	N ta natural son berilgan. Uning elementlarini teskari tartibda chiqaruvchi dastur tuzing.

    val input = Scanner(System.`in`)
    val numbers = input.nextInt()

    val intNumber = IntArray(numbers)

    for (i in intNumber.indices) {
        intNumber[i] = intNumber[i] + input.nextInt()
    }

    var reversed = ""

    for (i in intNumber.size - 1 downTo 0) {
        reversed += intNumber[i].toString()
    }

    println(reversed)
}