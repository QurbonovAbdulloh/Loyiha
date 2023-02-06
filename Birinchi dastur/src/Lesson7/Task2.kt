fun main(args: Array<String>) {

    /*Vazifa2 -> Haqiqiy sonni ishorasini aniqlovchi "Ishora" nomli funksiya hosil qilish.
                 Funksiya argumenti 0 dan kichik bo'lsa -1, 0 dan katta bo'lsa 1,
                 0 ga teng bo'lsa 0 qiymat qaytarsin.*/

    println(ishora(-25))

}

fun ishora(a: Int): Int {
    return if (a > 0) {
        1
    } else if (a < 0) {
        -1
    } else {
        0
    }
}