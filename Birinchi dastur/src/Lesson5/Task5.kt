import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    /*Vazifa5 -> 1dan 7gacha bo'lgan sonlarga mos ravishda hafta kunlari berilgan.
    Kiritilgan songa mos ravish hafta kunini so'zda chiqarib beruvci dastur tuzish.*/

    println("Birdan yettigacha bo'lgan sonlarga parallel ravishda hafta kunini topib beruvchi dastur")
    print("Sonni kiriting: ")
    val result = when (Scanner.nextInt()) {
        1 -> "Dushanba"
        2 -> "Seshanba"
        3 -> "Chorshanba"
        4 -> "Payshanba"
        5 -> "Juma"
        6 -> "Shanba"
        7 -> "Yakshanba"
        else -> "Bunday kun mavjud emas!"
    }
    println("Natija: $result")
}