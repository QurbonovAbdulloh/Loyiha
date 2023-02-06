fun main(args: Array<String>) {

    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4) {
            break
        }
    }

    var a = 0
    while (a < 10) {
        if (a == 4){
           a++
           continue
        }
        println(a)
        a++
    }
}