package ConteudosAula3Funcoes
fun main(args: Array<String>){
//    println("Sua furtuna é ${ConteudosAula3.getFortuneCookie()}")

    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")
        if (fortune.contains("z")) break
    }

}

fun getFortuneCookie() : String {
    val list = listOf("x", "y", "z")
    print("Quando é o seu aniversário? ")

    val birthday = readLine()?.toIntOrNull() ?: 1
    return list[birthday.rem(list.size)]

}

//fun ConteudosAula3.getFortuneCookie() {
//    val list = listOf("x", "y", "z")
//    print("Quando é o seu aniversário? ")
//    val birthday = readLine()
//
//    return when(birthday){
//        "abril" -> println(list[1])
//        else -> println(list[2])
//    }
//}