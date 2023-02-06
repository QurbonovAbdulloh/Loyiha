import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    //Vazifa3 -> Yil berilgan (musbat sonda). Berilgan yilda necha kun borligini aniqlab beruvchi dastur tuzish

    println("Kiritgan yilingiz kabisa yili yoki kabisa yili emasligini aniqlab beruvchi dastur")
    print("Yilni kiriting: ")
    val yil: Int = Scanner.nextInt()

    if (yil > 0 && yil % 4 == 0) {
        println("Bu kabisa yili hisoblanadi va bu yilda 366 kun mavjud.")
    } else {
        println("Bu yilda 365 kun mavjud.")
    }
}