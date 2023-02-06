fun main(args: Array<String>) {

    val rows = 2
    val columns = 3
    val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
    val sedondMatrix = arrayOf(intArrayOf(2, 3, 3), intArrayOf(5, 6, 3))

    val sum = Array(rows) { IntArray(columns) }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            sum[i][j] = firstMatrix[i][j] + sedondMatrix[i][j]
        }
    }

    println("Sum of two matrices is: ")
    for (row in sum) {
        for (column in row) {
            print(" $column ")
        }
        println()
    }

}