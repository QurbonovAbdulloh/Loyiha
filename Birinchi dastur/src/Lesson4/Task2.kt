import java.util.*
import kotlin.math.sqrt

fun main() {

    val scanner = Scanner(System.`in`)

    //Vazifa2 -> To'g'ri burchakli uchburchakning gipotenuzasini katetlari yordamida topish

    println("Katetlar yordamida gipotenuzani topish: ")
    print("Birinchi katetni kiriting: ")
    val katetA: Double = scanner.nextDouble()
    print("Ikkinchi katetni kiriting: ")
    val katetB: Double = scanner.nextDouble()
    print("Gipotenuza: " + sqrt(Math.pow(katetA.toDouble(), 2.0) + Math.pow(katetB.toDouble(), 2.0)))

}