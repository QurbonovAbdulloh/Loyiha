import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    /*Vazifa8 -> Kiritilgan "String" turidagi qiymatni oxirgi va undan oldingi element o'rinlarini
    o'zgartirgan holda chop qiluvchi dastur tuzish*/

    println("Kiritilgan \"String\" turidagi qiymatni oxirgi va undan oldingi element o'rinlarini\n" +
            "o'zgartirgan holda chop qiluvchi dastur")
    print("Qiymatni kiriting: ")
    val word: String = Scanner.next()
    val start = word.substring(0, word.length - 2)
    val end = word.substring(word.length - 2)
    val oxirgi1: Char = end.get(1)
    val oxirgi2: Char = end.get(0)


    println(start+oxirgi1+oxirgi2)
}