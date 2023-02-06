import java.util.*

fun main(args: Array<String>) {

    /*Vazifa1 -> Haydovchilik guvohnomasini olish tizimini tashkil qiling. Bunda Exceptionlardan foydalaning.
                 Bu tizimda o'zingiz loyiha yaratib guvohnoma berish tartibini shakllantirasiz.*/

    val scanner = Scanner(System.`in`)

    println("""Haydovchilik guvohnomasini olish uchun quyidagi ro'yxatdan o'ting.
        |ESLATMA: Haydovchining yoshi 18 dan o'tgan yoki 18 yoshga to'lgan va haydovchilik guvohnomasini olish uchun 
        |1 800 000 so'm to'lov qilgan bo'lishi lozim. Aks holda haydovchilik guvohnomasi berilmaydi.
        |1 -> Ro'yxatdan o'tish
    """.trimMargin())

    while (true) {

        when (scanner.next()) {

            "1" -> {
                print("Ismingizni kiriting: ")
                val ism: String = scanner.next()
                print("Familyangiznii kiriting: ")
                val familya: String = scanner.next()
                print("Yoshingizni kiriting: ")
                val yosh: Int = scanner.nextInt()
                print("Haydovchilik guvohnomasi uchun to'langan summani kiriting: ")
                val summa: Int = scanner.nextInt()

                try {
                    if (yosh < 18 || summa < 1800000) {
                        throw ArithmeticException("Sizga ruxsat yo'q.")
                    } else println("Sizga ruxsat.")
                } catch (e: ArithmeticException) {
                    e.printStackTrace()
                }

            }
        }
    }
}