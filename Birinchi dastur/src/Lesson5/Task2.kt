import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    //Vazifa2 -> OX va OY o'qlarida yotmaydigan nuqtaning choragini aniqlab beruvchi dastur

    println("Nuqtaning choragini aniqlab beruvchi dastur")
    print("'x'ni kiritng:")
    val x: Int = Scanner.nextInt()
    print("'y'ni kiriting:")
    val y: Int = Scanner.nextInt()

    if (y > 0) {
        if (x > 0) {
            println("Bu nuqta birinchi chorakda yotadi.")
        } else {
            println("Bu nuqta ikkinchi chorakda yotadi.")
        }
    } else if (y < 0) {
        if (x < 0) {
            println("Bu nuqta uchinchi chorakda yotadi.")
        } else {
            println("Bu nuqta to'rtinchi chorakda yotadi.")
        }
    }
}