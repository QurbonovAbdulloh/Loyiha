import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    //Vazifa3  -> Uchta sondan kattasini topib beruvchi dastur yasash

    println("Uchta sondan kattasini topib beruvchi dastur")
    print("Birinchi sonni kiriting: ")
    var son1: Double = scanner.nextDouble()
    print("Ikkinchi sonni kiriting: ")
    var son2: Double = scanner.nextDouble()
    print("Uchinchi sonni kiriting: ")
    var son3: Double = scanner.nextDouble()
    val d: Double = max(son1, son2)
    val e: Double = max(d, son3)
    print("Javob: " + e)

}