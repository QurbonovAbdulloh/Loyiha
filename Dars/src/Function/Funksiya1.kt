fun main(args: Array<String>) {

    println(getName("Abdulloh", "Qurbonov"))       //1-funksiyaga misol

    val a: Boolean = true                                     //2-misol
    val b: Boolean = false

    val result: Boolean = a or  b         //or -> ||   //true or false
    println(result)



    val c: Boolean = true                                     //3-misol
    val d: Boolean = false

    val result1: Boolean = c and d        //and -> && //true and false
    println(result1)




}

fun getName(ism: String, familya: String) = "$ism $familya"    //1-funksiya