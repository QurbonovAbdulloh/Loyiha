fun main(args: Array<String>) {

    println(factorial(5))                     //Faktorialni hisoblashga misol

    println(factorial(5))                     //Faktorialni hisoblashga misol, 2-variant

}

fun factorial(n: Int): Long {                    //Faktorialni hisoblash
    return if (n == 1) {
        n.toLong()
    } else {
        n * factorial(n - 1)
    }
}

tailrec fun fact(n: Int, run: Int = 1): Long {   //Faktorialni hisoblash, 2-variant
    if (n == 1) {
        return run.toLong()
    } else {
        return fact(n-1, run * n)
    }
}