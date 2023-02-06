package Null

import java.util.*

fun main(args: Array<String>) {

    //RO'YXATDAN O'TISH TIZIMI

    val scanner = Scanner(System.`in`)

    val nameArray = arrayOfNulls<String>(100)
    val surnameArray = arrayOfNulls<String>(100)
    val ageArray = arrayOfNulls<Int>(100)
    val usernameArray = arrayOfNulls<String>(100)
    val passwordArray = arrayOfNulls<String>(100)
    var count: Int = 0

    while (true) {
        println("""1 -> Ro'yxatdan o'tish                
            |2 -> Tizimga kirish
            |3 -> Foydalanuvchi ma'lumotlarini qidirish
            |4 -> Tahrirlash
            |5 -> O'chirish
            |6 -> Foydalanuvchilar ro'yxati
        """.trimMargin())

        when(scanner.next()) {
            "1" -> {
                print("Ismingizni kiriting: ")
                val name: String? = scanner.next()
                print("Familyangizni kiriting: ")
                val surname: String? = scanner.next()
                print("Yoshingizni kiriting: ")
                val age: Int? = scanner.nextInt()
                print("Foydanlanish uchun \"Username\" kiriting: ")
                val username: String? = scanner.next()
                print("Parol yarating: ")
                val password: String? = scanner.next()

                nameArray[count] = name
                surnameArray[count] = surname
                ageArray[count] = age
                usernameArray[count] = username
                passwordArray[count] = password

                count++
            }
            "2" -> {

                var isHave = false
                var index = -1

                print("\"Username\"ni kiriting: ")
                val usernameToEnter: String = scanner.next()
                print("Parolni kiriting: ")
                val passwordToEnter: String = scanner.next()

                for (i in 0 until count) {
                    if (usernameToEnter ==  usernameArray[i] && passwordToEnter == passwordArray[i]) {
                        isHave = true
                        index = i
                        break
                    }
                }

                if (isHave) {
                    println("Tizimga xush kelibsiz xurmatli ${nameArray[index]}.")
                } else println("Noto'g'ri ma'lumot kiritdingiz.")
            }
            "3" -> {

                var isHave = false
                var index = -1

                print("\"Username\"ni kiriting: ")
                val usernameToFind: String = scanner.next()
                print("Parolni kiriting: ")
                val passwordToFind: String = scanner.next()


            }
            "4" -> {

            }
            "5" -> {

            }
            "6" ->{

            }
        }
    }

}