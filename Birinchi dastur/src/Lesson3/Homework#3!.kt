import kotlin.math.sqrt

fun main(args: Array<String>) {

    //Vazifa1 (ko'chirilgan)

    val PI = 3.14
    val S = 20
    val d = sqrt(4 * S / PI)
    val r = d / 2
    println("Diametr: $d")
    println("Radius: $r")

    //Vazifa2 (o'zim ishlaganman)

    var Tezlik: Int = 40  //Birinchi mashina tezligi
    var Tezlik1: Int = 50  //Ikkinchi mashina tezligi
    var Vaqt: Double = 3.5 //Vaqt
    val Masofa: Double = (( Tezlik + Tezlik1 ) * Vaqt )

    println("Masofa: $Masofa")

    //Vazifa3 (ko'chirilgan)

    val raqam: Int = 936
    val uch: Int = raqam % 10
    val ikki: Int = raqam / 10 % 10
    val bir: Int = raqam / 100
    val javob: String = "$bir$ikki$uch"

    println(javob)

    //Vazifa4 (ko'chirilgan)

    var sekund: Int = 85763
    val soat: Int = sekund / 3600
    sekund %= 3600
    val minut: Int = sekund / 60
    sekund %= 60

    println("Kiritilgan sekund:$soat soat,$minut minut,$sekund sekundga teng. ")





}