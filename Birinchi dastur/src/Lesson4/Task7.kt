import java.util.*

fun main(args: Array<String>) {

    //Vazifa7 -> Kiritilgan "String" turidagi qiymatni o'rtasidagi 2ta elementni chop qiluvchi dastur tyuzish

    val Scanner = Scanner(System.`in`)

    println("Kiritilgan \"String\" turidagi qiymatning o'rtasidagi 2ta elementini chop qiluvchi dastur")
    print("Qiymat kiriting: ")
    val word: String = Scanner.next()
    val end: String = word.substring(word.length / 2)
    val start: String = word.substring(0, word.length / 2)

    val startEnd: String = start.substring(start.length - 1)
    val endStart: Char = end[0]

    println(startEnd + endStart)
}