import java.util.*

fun main(args: Array<String>) {

    //vazifa5 -> Kiritilgan string turidagi qiymatni oxirgi ikkita elementini boshidan yozuvchi dastur tuzish.

    val Scanner = Scanner(System.`in`)

    println("Kiritilgan string turidagi qiymatni oxirgi ikkita elementini boshidan yozuvchi dastur")
    print("Qiymatni kiriting: ")
    var word: String = Scanner.next()
    val start = word.substring(0, word.length - 2)
    val end = word.substring(word.length - 2)
    println(end + start)
}