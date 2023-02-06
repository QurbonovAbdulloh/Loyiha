fun main(args: Array<String>) {

    println(kattasi(5, 4))   //misol          // Standart funksiya

    val qaytim: Int = kattasi(6, 7)                //1-misol
    println(qaytim * 2)

    salom()                                              //2-misol


    val max: Double = myMaxFunction(6, 7)                    //3-misol

    val userNumber: Double = 9.0

    if (max >= userNumber) {
        println("Siz kiritgan son bizdagi sondan kichik")
    } else {
        println("Siz kiritgan son bizdagi sondan katta")
    }

}

fun kattasi(a: Int, b: Int): Int {  //1-funksiya        // Foydalanuvchi tomonidan ishlab chiqarilgan funksiyalar
    return if (a >= b) {
        a
    } else {
        b
    }
}

fun salom() {                                     //2-funksiya
    println("Hello, Hi, How are you?")
}

fun myMaxFunction(a: Int, b: Int): Double {       //3-funksiya
    return if (a >= b) {
        a.toDouble()
    } else {
        b.toDouble()
    }
}