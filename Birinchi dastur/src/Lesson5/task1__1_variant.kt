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

    if (a < b && a >= 0) {
        if (abs(a - b) < abs(a - c)) {
            val masofa: Int = abs( b - a )
            println("'A' nuqtaga eng yaqin nuqta 'B' nuqta va ular orasidagi masofa $masofa ga teng.")
        } else if (abs(a - b) > abs(a - c)) {
            val masofa: Int = abs( c - a )
            println("'A' nuqtaga eng yaqin nuqta 'C' nuqta va ular orasidagi masofa $masofa ga teng.")
        }
    } else if (a > b && a <= 0) {
        if (abs(a - b) > abs(a - c)) {
            val masofa: Int = abs( a - b )
            println("'A' nuqtaga eng yaqin nuqta 'B' nuqta va ular orasidagi masofa $masofa ga teng.")
        } else if (abs(a - b) > abs(a - c)) {
            val masofa: Int = abs( a - c )
            println("'A' nuqtaga eng yaqin nuqta 'C' nuqta va ular orasidagi masofa $masofa ga teng.")
        }
    }   //Ikkinchi qism, chalg'imimiz
    else if (a > b && b >= 0) {
        if (abs(a - b) < abs(a - c)) {
            val masofa: Int = abs( a - b )
            println("'A' nuqtaga eng yaqin nuqta 'B' nuqta va ular orasidagi masofa $masofa ga teng.")
        } else if (abs(a - b) > abs(a - c)) {
            val masofa: Int = abs( a - c )
            println("'A' nuqtaga eng yaqin nuqta 'C' nuqta va ular orasidagi masofa $masofa ga teng.")
        }
    } else if (a < b && b <= 0) {
        if (abs(a - b) < abs(a - c)) {
            val masofa: Int = abs( a - b )
            println("'A' nuqtaga eng yaqin nuqta 'B' nuqta va ular orasidagi masofa $masofa ga teng.")
        } else if (abs(a - b) > abs(a - c)) {
            val masofa: Int = abs( a - c )
            println("'A' nuqtaga eng yaqin nuqta 'C' nuqta va ular orasidagi masofa $masofa ga teng.")
        }

    }
}