package Exception

fun main(args: Array<String>) {

    val str = getNumber("10f")

    println(str)

}

fun getNumber(string: String): Int{
    return try {
        Integer.parseInt(string)
    } catch (e: NumberFormatException) {
        0
    }
}