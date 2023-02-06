fun main(args: Array<String>){

    val a: Int = 10
    val b: Int = 24
    val c: Int = 18
    val d: Int = (a + b + c)/3

    println(d)

    var text10 = "QWERTYUIOPASDFGHJKLZXCVBNM"

    println(text10.length)

    var text9 = "Hello world"

    println(text9.toUpperCase())
    println(text9.toLowerCase())

    var txt1 = "Hello World"
    var txt2 = "Hello World"

    println(txt1.compareTo(txt2))

    var txt = "Hello World"

    println(txt[3])
    println(txt[0])

    var firstName = "Abdulloh"
    var lastName = "Qurbonov"

    println("$firstName $lastName")
    println(firstName.plus(lastName))

    val qiymat1: Int = 25
    val qiymat2: Int = 20
    if (qiymat1>qiymat2)
        println("$qiymat1 soni $qiymat2 dan katta")


}