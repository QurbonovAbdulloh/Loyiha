package `Mustaqil6, Funksiya`

fun main(args: Array<String>) {

    myFunction("John", 35)
    myFunction("Jane", 25)
    myFunction("Jim", 30)

    myFunction1(10)
    myFunction1(15)
    myFunction1(20)

    var result = myFunction2(3 + 7)

    println(result)

}

fun myFunction(ism: String, yosh: Int) {

    println("$ism Doe is $yosh")

}

fun myFunction1(number: Int) {

    println(number + 100)

}

fun myFunction2(x: Int): Int {

    return (x + 5)
}