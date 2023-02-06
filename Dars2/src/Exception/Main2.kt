package Exception

fun main(args: Array<String>) {

    val array = arrayOf("Hi", "Hello")

    try {
        for (i in 0..array.size) {
            println(array[i])
        }
    } catch (e: ArrayIndexOutOfBoundsException) {
        e.printStackTrace()
    }
}