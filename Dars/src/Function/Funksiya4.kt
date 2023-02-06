fun main(args: Array<String>) {

    show()                                                    //1-funksiyaga misol
    show(age = 19)
    show("Abdulloh")
    show("Abdulloh", 19)

    displayBorder()                                           //2-funksiyaga misol
    println(" ")
    displayBorder(length = 15)
    println(" ")
    displayBorder(character = '*')
    println(" ")
    displayBorder('*', 15)

    demo(99)                                           //3-funksiyaga misol
    demo(99,'Z')
    demo(ch = 'Z')

    ("Sum: ${sum(10, 20, 30, 40)}")               //4-funksiyaga misol
    sum1(10,20,30,40,)                             //5-funksiyaga misol

    val sum2: (Int, Int) -> Int = {num1: Int, num2: Int -> num1 +num2 } //6-funksiyaga misol
    println(sum2(6, 4))

}                                                             //1-funksiya

fun show(name: String = "Username", age: Int = 18) {
    println("My name is: $name, $age ")
}

fun displayBorder(character: Char = '=', length: Int = 15) {   //2-funksiya
    for (i in 1..length) {
        print(character)
    }
}

fun demo(number: Int = 100, ch: Char = 'A') {                  //3-funksiya
    println("Number is: $number, and Character is: $ch")
}

fun sum(vararg numbers: Int) {                                 //4-funksiya
    var sum = 0
    numbers.forEach { num ->
        sum += num
        println(sum)
    }
}

fun sum1(vararg number: Int) {                                //5-funksiya
    var sum1: Int = 0
    for (i in number) {
        sum1 += i
    }

    println(sum1)

}

fun sum2(num1: Int, num2: Int) {
    println(num1 + num2)
}