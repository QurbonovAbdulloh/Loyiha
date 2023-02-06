import java.util.*

fun main(args: Array<String>) {

       /*Vazifa5 -> A va B butun soni berilgan (A-B).
                    A va B sonlari orasidagi barcha butun sonlarni chiqaruvchi programma tuzilsin.
                    Bunda A soni 1 marta, (A+1) soni 2 marta chiqariladi va h.k.*/


    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    for (i in a..b) {
        var j = i
        while (j > 0) {
            println(i)
            j--
        }
    }
}