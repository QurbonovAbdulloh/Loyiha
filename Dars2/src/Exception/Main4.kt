package Exception

import java.lang.Exception

fun main(args: Array<String>) {

    try {
        val a = IntArray(5)
        a[5] = 10 / 0
    } catch (e: ArithmeticException) {
        println("ArithmeticException")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException")
    } catch (e: Exception) {
        println("Exception")
    }

    println("Tugadi...")
}