package Lesson7

import java.util.*

fun main(args: Array<String>) {

    /*Vazifa7 -> Berilgan satrdagi barcha ‘x’ elementlarini satr so’ngiga o’tkazuvchi funksiya tuzilsin.Masalan:
                 ("xxre") → "rexx"
                 ("xxhixx") → "hixxxx"*/

    val scanner = Scanner(System.`in`)
    val text = scanner.nextInt()


}

fun checkCase(text: String, s: Int = text.length, n: Int = 0): String {

    return if (n == s) {
        text
    } else {
        if (text[0] == 'x') {
            checkCase(text.substring(1) + 'x', s + 0, n + 1)
        } else text[0] + checkCase(text.substring(1), s + 0, n + 1)
    }
}