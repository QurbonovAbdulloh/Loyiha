package Lesson8

fun main(args: Array<String>) {

    /*Vazifa5 -> Massiv elementlari berilgan. Massivning eng katta ikkinchi elementini aniqlovchi dastur tuzish*/

    val numbers = arrayOf(10, 4, 8, 28, 49, 10, 45)

    var bigNumber = numbers[0]

    for (i in numbers.indices) {
        if (bigNumber < numbers[i]) {
            bigNumber = numbers[i]
        }
    }

    var secondBigNumber = numbers[0]
    var result = numbers[0]

    for (i in numbers.indices) {
        if (secondBigNumber < numbers[i]) {
            secondBigNumber = numbers[i]
            if (secondBigNumber < bigNumber) {
                result = secondBigNumber
            }
        }
    }
    println("Ikkinchi eng katta son: $result")


}