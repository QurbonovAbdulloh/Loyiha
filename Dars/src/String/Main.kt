@file:JvmName("MainKt")

package Massiv

fun main(args: Array<String>) {

    println("""Assalomu alaykum.
        |Menyuga kirish uchun 1ni bosing
    """.trimMargin())

    println("Abdulloh".length + 22)
    val matn1: String = "Codial"
    val matn2: String = "CODIAL"

    println(matn1.equals(matn2))
    println(matn1 == matn2)
    println(matn1.compareTo(matn2))

    val name: String = "Abdulloh"

    println(name.get(5))
    println(name[5])

    println(name.subSequence(0, 5))
    println(name.substring(0, 5))

    println(name.contains("Adul"))

    val surname: String = "qurbonov"

    println(surname.capitalize())

    val firstname: String = "ABDULLOH"

    println(firstname.decapitalize())

    println(surname.toUpperCase())
    println(firstname.toLowerCase())

    val text: String = ""
    val text1: String = " "

    println(text.isEmpty())
    println(text1.isEmpty())
    println(text.isBlank())
    println(text1.isBlank())

    val txt: String = "             ."

    println(txt)

    val txt1: String = "             .             "

    println(txt1.trim())

    println(txt1.trimStart())
    println(txt1.trimEnd())
    println(txt1.trimMargin())

    val hello: String = "Salom, qalaysan?"

    println(hello)
    println(hello.replace("qalaysan", "yaxshimisiz"))
}