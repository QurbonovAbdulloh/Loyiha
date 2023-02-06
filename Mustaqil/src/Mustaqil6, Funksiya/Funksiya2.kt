package `Mustaqil6, Funksiya`

fun main(args: Array<String>) {

    val result = myFunction(3)         //1-funksiyaga misol
    println(result)

    val result1 = myFunction1(3,5)  //2-funksiyaga misol
    println(result1)

    var result2 = myFunction2(3,5)  //3-funksiyaga misol
    println(result2)


}

fun myFunction(x: Int): Int {             //1-funksiya
    return (x + 5)
}

fun myFunction1(x: Int, y: Int): Int {    //2-funksiya
    return (x + y)
}

fun myFunction2(x: Int, y: Int) = x + y   //3-funksiyaga misol