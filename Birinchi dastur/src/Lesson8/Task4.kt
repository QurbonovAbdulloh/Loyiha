package Lesson8

fun main(args: Array<String>) {

    /*Vazifa4 -> m va n butun sonlar berilgan. m * n o'lchamli matritsani hosil qiling.*/

    val row = 4
    val column = 4

    val matrixArray = arrayOf(3, 5, 7, 2, 4, 6)
    val matrix = Array(row) { IntArray(column) }

    for (i in matrix.indices) {
        for (j in 0 until column) {
            matrix[i][j] = matrixArray[i]
        }
    }

    for (i in 0 until row) {
        for (j in 0 until column) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}