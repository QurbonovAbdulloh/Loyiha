fun main(args: Array<String>) {

    for (i in 1..10) {
        println(i)
    }

    for (e in 'A'..'Z') {
        println(e)
    }

    for (q in 'a'..'z') {
        println(q)
    }

    for (r in '#'..'/') {
        println(r)
    }

    val t = 1..10
    println("5 soni bormi? :${5 in t}")

    val number = 1.rangeTo(10) //1..10
    println(number)

    val number2 = 6.downTo(1)  //6 downTo 1
    println(number2)

    for (y in number2.reversed()) {
        println(y)
    }
}