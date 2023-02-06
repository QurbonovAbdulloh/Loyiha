import java.util.*

fun main(args: Array<String>) {

    /*Vazifa8 -> Ikkita butun son berilgan. D(kun), M(oy).
                 Berilgan sana qaysi burjga kirishini aniqlovchi dastur tuzish*/
    //"Qovg'a" (20.01 - 18.02), "Baliq" (19.02 - 20.03), "Qo'y" (21.03 - 19.04)
    //"Buzoq" (20.04-20.05), "Egizaklar" (21.05-21.06), "Qisqichbaqa" (22.06-22.07)
    //"Arslon" (23.07-22.08), "Parizod" (23.08-22.09), "Tarozi" (23.09-22.10)
    //"Chayon" (23.10-22.11), "O'qotar" (23.11-21.12), "Echki" (22.12-19.01)

    val scanner = Scanner(System.`in`)
    print("Kunni kiriting: ")
    val day = scanner.nextInt()
    print("Oyni kiriting: ")
    val month = scanner.nextInt()

    when(month) {
        1 -> if (day >= 20) println("Qov'g'a") else println("Echki")     //yanvar
        2 -> if (day >= 19) println("Baliq") else println("Qovg'a")      //fevrral
        3 -> if (day >= 21) println("Baliq") else println("Qo'y")     //mart
        4 -> if (day >= 20) println("Buzoq") else println("Qo'y")     //aprel
        5 -> if (day >= 21) println("Egizaklar") else println("Buzoq")     //may
        6 -> if (day >= 22) println("Qisqichbaqa") else println("Egizaklar")     //iyun
        7 -> if (day >= 23) println("Arslon") else println("Qisqichbaqa")     //iyul
        8 -> if (day >= 23) println("Parizod") else println("Arslon")     //avgust
        9 -> if (day >= 23) println("Tarozi") else println("Parizod")     //sentabr
        10 -> if (day >= 23) println("Chayon") else println("Tarozi")    //oktabr
        11 -> if (day >= 23) println("O'qotar") else println("Chayon")    //noyabr
        12 -> if (day >= 22) println("Echki") else println("Qovg'a")    //dekabr
    }

}