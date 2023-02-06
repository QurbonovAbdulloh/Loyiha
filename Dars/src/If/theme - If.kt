fun main(args: Array<String>) {

    val ustozIshBuyurdi: Boolean = true

    if (ustozIshBuyurdi) {
        println("Ustozni ishini bajar.")
    } else {
        println("Ustoz biror bir ishingiz bormi?")
    }

    val bezovtaQilishmoqda: Boolean = false

    if (bezovtaQilishmoqda) {
        println("Eshikni qulflab qo'yish kerak (mening fikrimcha).")
    } else {
        println("Darsni sokinlik ila davom etish kerak. Shundaymi?!")
    }

    val number1: Int = 20

    if (number1 % 2 == 0) {
        println("Bu son juft son")
    } else {
        println("Bu son toq son")
    }

    val asal: String = "Yo'q"

    if ( asal == "Bor") {
        println("Asal olib kel")
    } else if (asal == "Yo'q") {
        println("Novvot olib kel")
    } else {
        println("Shakar olib kel")
    }

    val number: Int = 2

    if (number in 100..999){
        if (number % 2 == 0) {
            println("Kiritilgan son uch xonalik juft son")
        } else {

            println("Kiritilgan son uch xonalik toq son")
        }
    } else if (number in 1..9){
        if (number % 2 == 0) {
            println("Kiritilgan son bir xonali juft son")
        } else {
            println("Kiritilgan son bir xonali toq son")
        }
    } else if (number in 10..99) {
        if (number % 2 == 0) {
            println("Kiritilgan son ikki xonali juft son")
        } else {
            println("Kiritilgan son ikki xonali toq son")
        }
    }
}