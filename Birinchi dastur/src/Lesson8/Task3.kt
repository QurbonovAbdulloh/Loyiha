package Lesson8

fun main(args: Array<String>) {

    /*Vazifa3 -> n ta butun sonlardan iborat massiv berilgan.
                 Massivdagi har bir toq sonni oxirgi toq songa orttiruvchi programma tuzilsin.
                 Agar toq sonlar bo'lmasa, massiv o'zgarishsiz qoldirilsin.*/


    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    var evenNumber = ""

    for (i in numbers.indices) {
        if (numbers[i] % 2 == 0) {
            evenNumber = evenNumber + "${numbers[i]}"
        }
    }

    println(evenNumber)
}