import java.util.*
import kotlin.random.Random.Default.nextInt

fun main(args: Array<String>) {

    game()

}             //Funksiya

fun game() {
    while (true){
        println("""1 -> Oddiy bosqich
            |2 -> O'rta bosqich
            |3 -> Qiyin bosqich
        """.trimMargin()
        )

        when(Scanner(System.`in`).next()) {
            "1" -> {
                mathGame(10)
            }
            "2" -> {
                mathGame(25)
            }
            "3" -> {
                mathGame(50)
            } else -> {
            println("Menyudagi raqamlardan foydalaning!")
        }
        }
    }
}

fun mathGame(number: Int) {

    val scanner = Scanner(System.`in`)
    val random = Random()

    var countTrue: Int = 0  //To'g'ri javob uchun o'zgaruvchi
    var countFalse: Int = 0  //Noto'g'ri javob uchun o'zgaruvchi
    var count: Int = 1

    myloop@ while (count <= 10) {
        val raqam1: Int = random.nextInt(number)
        val raqam2: Int = random.nextInt(number)
        val operator: Int = random.nextInt(4)
        var javob: Int = 0


        when (operator) {
            0 -> {
                javob = raqam1 + raqam2
                print("$raqam1 + $raqam2 = ")
            }
            1 -> {
                javob = raqam1 - raqam2
                print("$raqam1 - $raqam2 = ")
            }
            2 -> {
                javob = raqam1 * raqam2
                print("$raqam1 * $raqam2 = ")
            }
            3 -> {

                if (raqam2 != 0) {
                    javob = raqam1 / raqam2
                } else {
                    continue@myloop
                }

                print("$raqam1 / $raqam2 = ")
            }
        }

        val foydalanuvchiJavobi: Int = scanner.nextInt()

        if (foydalanuvchiJavobi == javob) {
            println("Javob to'g'ri")
            count++       //Umumiy javobni sanaydi
            countTrue++   //To'g'ri javoblarni sanaydi
        } else {
            count++         //Umumiy javobni sanaydi
            countFalse++    //Noto'g'ri javoblarni sanaydi
            println("Javob noto'g'ri. To'g'ri javob: $javob")
        }
        if (count == 11) {
            println("Natija: To'g'ri javob: $countTrue, noto'g'ri javob: $countFalse")
            if (countTrue >= 5) {
                println("Hisoblashni o'rganishda davom eting.")
            } else {
                println("O'z ustingizda ishlang!")
            }
        }
    }
}