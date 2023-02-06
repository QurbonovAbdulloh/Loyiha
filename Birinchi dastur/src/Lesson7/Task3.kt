import kotlin.math.sqrt

fun main(args: Array<String>) {

    /*Vazifa3 -> IsSquare(K) mantiqiy funksiyasini hosil qilish(K>0).
                 Agar K biror butun sonning kvadrati bo'lsa <<true>>,
                 aks holda <<false>> qiymati qaytarilsin*/

    IsSquare(10)
}

fun IsSquare(k: Int): Boolean {
    val a: Double = sqrt(k.toDouble())
    return a * a == k.toDouble()
}