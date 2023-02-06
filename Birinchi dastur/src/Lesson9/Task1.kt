package Lesson9

import java.util.*

fun main(args: Array<String>) {

    /*Vazifa1 -> Haydovchilik guvohnomasini olish tizimini tashkil qiling. Bunda Exceptionlardan foydalaning.
                 Bu tizimda o'zingiz loyiha yaratib guvohnoma berish tartibini shakllantirasiz.*/

    val scanner = Scanner(System.`in`)

    println("Haydovchilik guvohnomasini olish uchun quyidagi ro'yxatdan o'ting.")
    println("""1 -> Ro'yxatdan o'tish.""")

    while (true) {

        when(scanner.next()) {

            "1" -> {
                print("Ismingizni kiriting: ")
                val ism: String = scanner.next()
                print("Familyangiznii kiriting: ")
                val familya: String = scanner.next()
                print("Passport seriyangizni kiriting: ")
                val seriya: Int = scanner.nextInt()

            }
        }
    }


}