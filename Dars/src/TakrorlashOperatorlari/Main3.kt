fun main(args: Array<String>) {

    var i: Int = 0

    while (i <= 3) {
        println("Hello")
        i++
    }

    do {
        println("Bir marotaba")
    } while (false)

    var number = 0

    do {
        println("Loop: $number")
        number++
    } while (number <= 5)

    for (d in 0..10) {
        if (d % 2 == 0) {
            continue
        }
        println(d)
    }

    for (a in 0..10) {
        if (a % 2 != 0) {
            continue
        }
        println(a)
    }

    for (q in 0..10) {
        for (w in q..10) {
            if (q % 2 == 0 || w % 2 == 0) {
                continue
            }
            println("Q: $q, W: $w")
        }
    }

    println("Ikkinchi variant")

    for (e in 0..10) {
        for (r in e..10) {
            println("E: $e, R: $r")
        }
    }

    for (o in 'A'..'D') {
        for (p in 1..4) {
            if (p == 1 || p == 3)
                continue
            println("$o and $p")
        }
    }

    myloop@for (t in 0..10) {
        for (y in t..10) {
            if (t % 2 == 0 || y % 2 == 0)
                continue@myloop
            println("T: $t, Y: $y")
        }
    }

    var m = 1

    while (m < 10) {
        if (m % 2 == 0) {
            m++
            continue
        }
        println("M: $m")
        m++
    }

    for (z in 0..10) {
        if (z % 2 == 0)
            break
    }
    val z = 0
    println(z)
}