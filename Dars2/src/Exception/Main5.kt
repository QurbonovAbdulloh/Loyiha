package Exception

import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    val yosh: Int = input.nextInt()
    val imtihonNatijasi: Boolean = input.nextBoolean()
    val tolov: Int = input.nextInt()

    try {
        if (yosh < 18) {
            throw ArithmeticException("Yoshingiz kichik.")
        } else {
            println("Tizimga kirishga ruxsat.")
        }
    } catch (e: ArithmeticException) {
        e.printStackTrace()
    }
}