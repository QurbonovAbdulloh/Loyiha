package Exception

fun main(args: Array<String>) {

    println("Ish boshlandi.")

    try {
        println(10 / 0)
    } catch (e: ArithmeticException) {
        e.printStackTrace()
        println("Ish davom etmoqda.")
    }

    println("Ish tugadi.")

}