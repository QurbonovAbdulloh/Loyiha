fun main(args: Array<String>) {

    /*Vazifa4 -> N!=1*2*...*N faktorialni hisoblovchi haqiqiy  toifadagi Fact(N) rekursiv funksiyasi tuzish (N>0 - butun toifadagi parametr).
                 Shu funksiya yordamida berilgan 3ta sonning faktoriallari hisoblansin.*/

    println(factorial(5))
    println(factorial(10))
    println(factorial1(15))

}

fun factorial(number: Int): Long {                      //Faktorialni hisoblash, 1-variant
    return if (number == 1) {
        number.toLong()
    } else {
        number * factorial(number - 1)
    }
}

tailrec fun factorial1(n: Int, run: Int = 1): Long {   //Faktorialni hisoblash, 2-variant
    if (n == 1) {
        return run.toLong()
    } else {
        return factorial1(n-1, run * n)
    }
}