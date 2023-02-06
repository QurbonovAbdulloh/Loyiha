import java.util.*

fun main(args: Array<String>) {

    /*Vazifa7 -> Berilgan satrning har bir elementini ‘*’ belgisi bilan ajratuvchi funksiya tuzilsin.
                 Masalan "Kotlin" -> "K*o*t*l*i*n".  */

    val scanner = Scanner(System.`in`)
    val word = scanner.next()

    println(textStar(word))

}

fun textStar(word: String, s: Int = word.length, n: Int = 0): String {

    return if (s - 1 == n) {
        word
    } else textStar(word.substring(0, 2 * n + 1) + "*" + word.substring(2 * n + 1), s + 0, n + 1)
}