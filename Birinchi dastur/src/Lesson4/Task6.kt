import java.util.*

fun main(args: Array<String>) {


    /*vazifa6 -> Kiritilgan "String" turidagi qiymatni boshidagi va oxiridagi elementini olib tashlab,
                 ma'lumotni chop qiluvchi dastur tuzish*/

    val Scanner = Scanner(System.`in`)

    println("Kiritilgan \"String\" turidagi qimatni boshidagi va oxiridagi elementini olib tashlab,\n" +
            "ma'lumotni chop qiluvchi dastur")
    print("Qiymat kiriting: ")
    val word: String = Scanner.next()
    val start = word.substring(1,word.length - 1)
    println(start)
}