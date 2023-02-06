import java.util.*

fun main(args: Array<String>) {

    /*Vazifa6 -> Massivlar yordamida lug'at dasturini yarating. So'zlarni qo'shish 2 turda olib boriladi.
                 Masalan, so'z qo'shish ENG->UZB yoki UZB->ENG. So'z va tarjimasini qo'shish, o'chirish, o'zgartirish,
                 barcha so'zlar ro'yxati(bunda 2 turda so'zlarni chiqarish imkoniyati bo'lsin), so'z qidirish.
                 Men tizimga 2 ta turda so'zlarni qo'sha olishim ularni boshqara olishim kerak.*/

    val scanner = Scanner(System.`in`)

    val engwordArray = arrayOfNulls<String>(10)
    val uzbwordArray = arrayOfNulls<String>(10)
    var count: Int = 0

    myloop@ while (true) {
        println(
            """1 -> | Eng -> Uzb lug'atni boyitish
            |2 -> | Uzb -> Eng lug'atni boyistish
            |3 -> So'zlarning tarjimasini qidirish
            |4 -> So'zlarning ro'yxati
            |5 -> So'zlarni tahrirlash
            |6 -> So'zlarni o'chirish
        """.trimMargin()
        )

        when (scanner.next()) {
            "1" -> {
                print("Inglizcha so'zni kiritng: ")
                val engword: String = scanner.next()
                print("So'zning o'zbek tilidagi tarjimasini kiriting: ")
                val uzbword: String = scanner.next()

                engwordArray[count] = engword
                uzbwordArray[count] = uzbword
                count++
                println("So'z lug'at dasturiga saqlandi.")
            }
            "2" -> {
                print("O'zbekcha so'zni kiriting: ")
                val uzbword: String = scanner.next()
                print("So'zning ingliz tilidagi tarjimasini kiriting: ")
                val engword: String = scanner.next()

                engwordArray[count] = engword
                uzbwordArray[count] = uzbword
                count++
                println("So'z lug'at dasturiga saqlandi.")
            }
            "3" -> {
                println(
                    """1 -> | Inglizcha - o'zbekcha
                    |2 -> | O'zbekcha - inglizcha
                    |3 -> | Bosh menyu
                """.trimMargin()
                )

                when (scanner.next()) {


                    "1" -> {

                        var isHave: Boolean = false
                        var index: Int = -1

                        print("So'zni kiriting: ")
                        val search = scanner.next()

                        for (i in 0 until count) {
                            if (engwordArray[i] == search) {
                                isHave = true
                                index = i
                                break
                            }

                            if (isHave) {
                                println("$search - ${uzbwordArray[index]}")
                            } else {
                                println("Yo'q")
                            }

                        }
                    }
                    "2" -> {

                        var isHave: Boolean = false
                        var index: Int = -1

                        print("So'zni kiriting: ")
                        val search = scanner.next()

                        for (i in 0 until count) {
                            if (uzbwordArray[i] == search) {
                                isHave = true
                                index = i
                                break
                            }
                        }

                        if (isHave) {
                            println("$search - ${engwordArray[index]}")
                        } else {
                            println("Yo'q")
                        }
                    }
                    "3" -> {
                        continue@myloop
                    }

                }

            }
            "4" -> {

                while (true) {
                    println(
                        """1 -> | Inglizcha - o'zbekcha so'zlar ro'yxati
                       |2 -> | O'zbekcha - inglizcha so'zlar ro'yxati
                       |3 -> | Bosh menyuga qaytish
                   """.trimMargin()
                    )
                    when (scanner.next()) {


                        "1" -> {
                            for (i in 0 until count) {
                                println("${engwordArray[i]} - ${uzbwordArray[i]}")
                            }
                        }
                        "2" -> {
                            for (i in 0 until count) {
                                println("${uzbwordArray[i]} - ${engwordArray[i]}")
                            }
                        }
                        "3" -> {
                            continue@myloop
                        }
                    }
                }
            }
            "5" -> {

                var isHave = false
                var index = -1

                println("Qa'ysi so'zni o'zgartirmoqchisiz?")

                print("O'zgartirmoqchi bo'lgan so'zingizni kiriting: ")
                val editWord = scanner.next()

                for (i in 0 until count) {
                    if (editWord.equals(uzbwordArray) || editWord.equals(engwordArray)) {

                        println("Siz o'zgartirmoqchi bo'lgan so'z topildi.")
                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {
                    print("\"$editWord\"ni o'zgartirish uchun yangi so'zni kiriting: ")
                    val newWord = scanner.next()

                    if (uzbwordArray[index] == editWord) {
                        uzbwordArray[index] = newWord
                    } else engwordArray[index] = newWord

                } else println("Siz o'zgartirmoqchi bo'lgan so'z topilmadi!")
            }
            "6" -> {
                var isHave = false
                var index = -1

                println("Qaysi so'zni o'chirmoqchisiz?")

                print("O'chirmoqchi bo'lgan so'zingizni kiriting: ")
                val deleteWord = scanner.next()

                for (i in 0 until count) {
                    if (uzbwordArray[i] == deleteWord || engwordArray[i] == deleteWord) {

                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {

                    engwordArray[index] = null
                    uzbwordArray[index] = null

                    engwordArray[index] = engwordArray[index + 1]
                    uzbwordArray[index] = uzbwordArray[index + 1]
                    count--
                } else {
                    println("Siz o'chirmoqchi bo'lgan so'z topilmadi!")
                }
            }
            else -> {
                println("Menyudagi raqamlardan foydalaning!")
            }
        }
    }
}