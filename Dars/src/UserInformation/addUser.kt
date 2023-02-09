package UserInformation

fun main(args: Array<String>) {

    val mainInformation = User()
    mainInformation.id = 45839274
    mainInformation.name = "Leanne Graham"
    mainInformation.username = "leannegraham@gmail.com"

    val adress = adress()
    adress.street = "Bir balo street"
    adress.city = "China town"
    adress.zipcode = "Qanaqadur kod bo'lishi kerak edi adshmasam."
    adress.suite = "Nimadurlar"

    val geo = geo()
    geo.lat = -45.42387
    geo.lng = 24.95479

    val connect = connect()
    connect.phone = 4378163
    connect.website = "Bir balo - bir balo nuqta com"

    val company = company()
    company.name = "Nimadur - nimadur"
    company.catchPharse = "O'sha nimadur nimadur"
    company.bs = "Bu nimaligini o'zim ham bilmiman"

    println("ID: "+ mainInformation.id)
    println("Name: "+ mainInformation.name)
    println("Username: "+ mainInformation.username)

    println("------------------------------------------------------")

    println("Street: "+ adress.street)
    println("City: "+ adress.city)
    println("Zipcode: "+ adress.zipcode)
    println("Suite: "+ adress.suite)

    println("------------------------------------------------------")

    println("Lat: "+ geo.lat)
    println("Lng: "+ geo.lng)

    println("------------------------------------------------------")

    println("Phone: "+ connect.phone)
    println("Website: "+ connect.website)



}