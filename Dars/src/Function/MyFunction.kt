package Function

class MyFunction {

    infix fun piramida(row: Int) {
        var k = 0
        for (i in 1..row) {
            k = 0
            for (j in 1..row-i) {
                print(" ")
            }
            while (k != 2 * i - 1) {
                print("*")
                ++k
            }
            println()
        }
    }

}