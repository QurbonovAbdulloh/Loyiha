import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    /*Vazifa4 -> 1dan 999gacha bo'lgan sonlar berilgan. Berilgan sonni "ikki xonali juft son", "uch xonali toq son"
    va hokazo qilib chiqarib beradigan dastur tuzish*/

    println("""1dan 999gacha bo'lgan sonlarni 'juft' yoki 'toq' ekanligini va necha xonali sonligini 
        |aniqlab beruvchi dastur""".trimMargin())
    print("Sonni kiriting: ")
    val number: Int = Scanner.nextInt()

    when(number) {
        in 1..9 -> {
            if (number % 2 == 0) {
                println("Bir xonali juft son.")
            } else {
                println("Bir xonali toq son.")
            }
        }
        in 10..99 -> {
            if (number % 2 == 0) {
                println("Ikki xonali juft son.")
            } else {
                println("Ikki xonali toq son.")
            }
        }
        in 100..999 -> {
            if (number % 2 == 0) {
                println("Uch xonali juft son.")
            } else {
                println("Uch xonali toq son.")
            }
        }
    }
}