import java.util.*

fun main(args: Array<String>) {

    val Scanner = Scanner(System.`in`)

    print("Birinchi raqamni kiriting: ")
    val raqam1: Double = Scanner.nextDouble()
    print("Ikkinchi raqamni kiriting: ")
    val raqam2: Double = Scanner.nextDouble()
    print("Operatorni kiriting: ")
    val operator: String = Scanner.next()

    when(operator){
        "+" ->{
            println(raqam1 + raqam2)
        }
        "-" ->{
            println(raqam1 - raqam2)
        }
        "*" ->{
            println(raqam1 * raqam2)
        }
        "/" ->{
            println(raqam1 / raqam2)
        }
        "%" ->{
            println(raqam1 % raqam2)
        }
    }
}
