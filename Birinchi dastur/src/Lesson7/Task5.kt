import java.util.*

fun main(args: Array<String>) {

    //Vazifa5 -> 5.	Random holatda 3 ta turli hil sonlarni ekranga chiqaruvchi recursive funksiya tuzish

    println(rendomSon())

}

    fun rendomSon(): String {
    val random = Random()
    val raqam1: Int = random.nextInt(10)
    val raqam2: Int = random.nextInt(50)
    val raqam3: Int = random.nextInt(100)

    return "$raqam1, $raqam2, $raqam3"
}