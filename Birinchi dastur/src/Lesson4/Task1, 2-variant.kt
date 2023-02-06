import kotlin.math.ceil

fun main(args: Array<String>) {

    println(kubildiz(125))

}

fun kubildiz(a: Int): Double {
    val daraja = 1/3
    val javob = ceil(Math.pow(a.toDouble(), daraja.toDouble()))
    return javob
}