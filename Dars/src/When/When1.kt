fun main(args: Array<String>) {

    val symbol: Char = '1'

    when(symbol) {
        'A', 'E', 'I', 'U', 'O' -> {
            println("Bu unli harf.")
        }
        'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z' -> {
            println("Bu undosh harf.")
        }
        else -> {
            println("Bunday harf mavjud emas!")
        }
    }

    val letter: Char = 'i'

    when(letter) {
        in 'A'..'Z' -> {
            println("Siz bosh harf kiritdingiz.")
        }
        in 'a'..'z' -> {
            println("Siz kichik harf kiritdingiz.")
        }
        else -> {
            println("Bunday harf mavjud emas!")
        }
    }


    when(val number: Int = 999) {
        in 1..9 -> {
            if (number % 2 == 0) {
                println("Bir xonali juft son.")
            } else {
                println("Bir xonali toq son.")
            }
        }
        in 10..99 -> {
            if (number % 2 == 0) {
                println("Ikki xonali juft son.")
            } else {
                println("Ikki xonali toq son.")
            }
        }
        in 100..999 -> {
            if (number % 2 == 0) {
                println("Uch xonali juft son.")
            } else {
                println("Uch xonali toq son.")
            }
        }
        in 1000..9999 -> {
            if (number % 2 == 0) {
                println("To'rt xonali juft son.")
            } else {
                println("To'rt xonali toq son.")
            }
        }
    }

    val age: Int = 17

    when(age) {
        in 1..17 -> {
            println("Sizning yoshingiz kichik!")
        }
        in 18..30 -> {
            println("Sizga kirishga mumkin.")
        }
        in 70..100 -> {
            println("Sizga bu dasturda nima bor:)")
        }
    }
}