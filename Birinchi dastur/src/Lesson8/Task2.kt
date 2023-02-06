package Lesson8

fun main(args: Array<String>) {

    /*Vazifa2 -> N ta sonlardan iborat massiv berilgan.
                 Massivning har bir elementini uning o’ng qo’shnisi bilan o’rta arifmetigiga almashtiruvchi dastur tuzing.*/

    val numbers = arrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)

    for (i in numbers.indices) {
        if (i < numbers.size - 2) {
            numbers[i] = (numbers[i] + numbers[i + 1]) / 2
            println(numbers[i])
        } else println(numbers[i])
    }



    val number = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println(number.size)
    println(number.indices)
}