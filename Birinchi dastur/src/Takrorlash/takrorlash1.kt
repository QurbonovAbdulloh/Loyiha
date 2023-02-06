fun main(args: Array<String>) {

    //2-masala

    val tezlik1: Int = 80
    val tezlik2: Int = 90
    val vaqt: Double = 2.5
    val javob2: Double = ( tezlik1 + tezlik2 ) * vaqt

    println(javob2)

    //3-masala

    var raqam: Int = 978
    var ikkinchiRaqam: Int = raqam / 10 % 10
    var uchinchiRaqam: Int = raqam % 10
    var birinchiRaqam: Int = raqam / 100
    println("Javob:$birinchiRaqam$uchinchiRaqam$ikkinchiRaqam")

    //4-masala

    var sekund: Int = 67890
    val soat: Int = sekund / 3600
    sekund = sekund % 3600
    val minut: Int = sekund / 60
    sekund = sekund % 60
    println("$soat soat $minut minut $sekund sekund")


}