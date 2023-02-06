
import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    //Vazifa6 -> Oy raqami berilgan. Shu oyda necha kun borligin aniqlab beruvchi dastur tuzish

    println("Nechinchi oyligiga qarab qaysi oyligini va o'sha oyda necha kun borligini topib beruvchi dastur")
    print("Sonni kiritnig: ")
    val result = when (Scanner.nextInt()) {
        1 -> "Yanvar oyida 31 kun mavjud."
        2 -> "Fevral oyida 28 kun mavjud."
        3 -> "Mart oyida 31 kun mavjud."
        4 -> "Aprel oyida 30 kun mavjud."
        5 -> "May oyida 31 kun mavjud."
        6 -> "Iyun oyida 30 kun mavjud."
        7 -> "Iyul oyida 31 kun mavjud."
        8 -> "Avgust oyida 31 kun mavjud."
        9 -> "Sentyabr oyida 30 kun mavjud."
        10 -> "Oktyabr oyida 31 kun mavjud."
        11 -> "Noyabr oyida 30 kun mavjud."
        12 -> "Dekabr oyida 31 kun mavjud."
        else -> "Bunday oy mavjud emas!"
    }
    println("Natija: $result")
}