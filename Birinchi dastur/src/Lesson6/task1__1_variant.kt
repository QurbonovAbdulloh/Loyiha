import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    /*Vazifa2 -> Kiritilgan "String" turidagi ma'lumotning har bir elementini 2 martadan
                 takrorlab chiqaruvchi dastur tuzish*/
    //Maslan: "Kotlin" -> "Kkoottlliinn

    println("Kiritilgan \"String\" turidagi ma'lumotning har bir elementini 2 martadan \n" +
            "takrorlab chiqaruvchi dastur")
    print("Ma'lumotni kiriting: ")
    val word: String = Scanner.next()
    for (i in word) {
        print(i.toString() + i.toString())
    }
}