import java.lang.Math.pow
import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    /*Vazifa3 -> "n" butun soni va "a" haqiqiy soni berilgan (n>0). Bir sikldan foydalanib quyidagi
                 "a"ning 1 dan "n"gacha bo'lgan barcha darajalarini chiqaruvchi dastur tuzish*/

    print("Sonni kiriting: ")
    val a: Int = Scanner.nextInt()
    print("Darjani kiriting: ")
    val n: Int = Scanner.nextInt()

    for (i in 1..n) {
        print("$a ning $i-darajasi: ")
        println((pow(a.toDouble(), i.toDouble())).toInt())
    }
}