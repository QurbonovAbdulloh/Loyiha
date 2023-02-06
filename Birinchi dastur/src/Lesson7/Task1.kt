import java.util.*

fun main(args: Array<String>) {

    //Vazifa1 -> Butun musbat sonning raqamlarini teskari tartibda chiqaruvchi InvertDigit nomli funksiya yasash

    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

    println(InvertDigit(number))


}
fun InvertDigit(numberInput: Int): Int {

    var number = numberInput
    var reverse = 0

    while (number != 0) {
        val digit = number % 10
        reverse = reverse * 10 + digit
        number /= 10
    }


    return reverse


}