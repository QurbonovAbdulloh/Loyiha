import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    /*Vazifa1 -> Sonlar o'qida A, B, C nuqtalar berilgan. A nuqtaga eng yaqin nuqta va
    ular orasidagi masofani topib beruvchi dastur tuzish*/

    print("'A' nuqtani kiriting: ")
    val a: Int = Scanner.nextInt()
    print("'B' nuqtani kiriting: ")
    val b: Int = Scanner.nextInt()
    print("'C' nuqtani kiriting: ")
    val c: Int = Scanner.nextInt()

    if (abs(a - b) < abs(a - c)) {
        val masofa: Int = abs(a - b)
        println("'A' nuqtaga eng yaqin nuqta 'B' nuqta va ular orasidagi masofa $masofa ga teng.")
    } else if (abs(a - b) > abs(a - c)) {
        val masofa: Int = abs(a - c)
        println("'A' nuqtaga eng yaqin nuqta 'C' nuqta va ular orasidagi masofa $masofa ga teng.")
    } else {
        val masofa: Int = abs(a - b)
        println("'A'nuqtaga qolgan ikkala nuqta ham bir xil uzoqlikda turibdi va ular orasidagi masofa $masofa ga teng.")
    }
}