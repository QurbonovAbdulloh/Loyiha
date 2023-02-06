import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    //Vazifa4 -> Kiritilayotgan "String" turidagi qiymatni oxirgi 2ta elementini 3 marta chop qiluvchi dastur tuzish

    println("<<String>> turidagi qiymatni  oxirgi 2ta elementini 3 marta chop qiluvchi dastur")
    print("Qiymatni kiriting: ")
    var word: String = Scanner.next()
    var end = word.substring(word.length - 2)

    print(end+end+end)
}