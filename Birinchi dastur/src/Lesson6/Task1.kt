import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)  //Scannerni Class dan obyeky olindi

    //Vazifa1 -> "n" butun son berilgan (n>0). Quyidagi yig'indini hisoblovshi dastur tuzish.
    // S=1+1/2+1/3+1/4+... .

    print("Sonni kiriting: ")         //Foydalanuvchiga sonni kiritish haqida tushintiryapti
    val number = input.nextInt()      //Foydalanuvchi sonni kiritishi uchun kod bilan joy ajratmoqda

    var sum = 0.0   /* "var" bilan o'zgaruvchi olyapti va "var" bilan olishining sababi
                        pastda "o'zgaruvchining qiymati o'zgarmoqda*/

    for (i in 1..number) {      /*Biz kiritgan qiymatnig barcha elementlarini aylanib o'tish uchun
                                        "for" takrorlash operatoridan foydalanilmoqda*/
        sum = sum + 1 / i.toDouble()      // "for"ning tanasidagi amallar bajarilmoqda:
    }

    println("Sum: $sum")              //Natija ekranga chiqmoqda
}