fun main(args: Array<String>) {

    for (chars in 'a'..'x') {
        println(chars)
    }

    for (numbers in 5..15) {
        if (numbers == 10){
            break
        }
        println(numbers)
    }

    val nums = arrayOf(2, 4, 6, 6, 8)
}