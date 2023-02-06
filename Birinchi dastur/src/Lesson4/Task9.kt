import java.util.*

fun main(args: Array<String>) {

    //Vazifa9 -> Kiritilgan "String" turidagi qiymat berilgan index idan boshlab chop qiluvchi dastur tuzish

    val Scanner = Scanner(System.`in`)

    println("Kiritilgan \"String\" turidagi  berilgan qiymat index idan boshlab chop qiluvchi dastur")
    print("Qiymatni kiritng: ")
    val word: String = Scanner.next()
    print("Indexni kiriting: ")
    val index: Int = Scanner.nextInt()
    val start = word.substring(index, word.length)
    println(start)

}