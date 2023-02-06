fun main(args: Array<String>) {

    val day = 7
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(result)

    if (20 > 18)

        println("20 soni 18 sonidan katta")

    val  time = 15

    if(time < 18) {

        println("Hayrli kun. ")

    } else {

        println("Hayrli kech. ")
    }

    val time1 = 9

    if (time1 < 10) {

        println("Hayrli tong.")

    }   else if (time1 < 20) {

        println("Hayrli kun.")

    }   else {

        println("Hayrli kech.")
    }

    for (i in 1..5) {
        println(i)
    }

    val number = 100
    for (i in 0 .. number step 3) {
        println(i)
    }


    var i = 0

    while (i < 5) {
        println(i)
        i++
    }


    var b = 0
    do {
        println(b)
        b++
    }

    while (b < 5)
}

