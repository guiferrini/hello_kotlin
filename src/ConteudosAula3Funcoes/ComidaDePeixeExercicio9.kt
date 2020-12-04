package ConteudosAula3Funcoes

fun main(args: Array<String>) {
//    var fortune: String
//    for (i in 1..10) {
//        fortune = ConteudosAula3.getFortune(ConteudosAula3.getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("foi")) break;
//    }

    var fortune: String = ""
    while (!fortune.contains("foi")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
    }

}
// Solução autor...
//fun ConteudosAula3.getFortune(birthday: Int): String {
//    val fortunes = listOf("You will have a great day!",
//            "Things will go well for you today.",
//            "Enjoy a wonderful day of success.",
//            "Be humble and all will turn out well.",
//            "Today is a good day for exercising restraint.",
//            "Take it easy and enjoy life!",
//            "Treasure your friends, because they are your greatest fortune.")
//    val index = when (birthday) {
//        in 1..7 -> 4
//        28, 31 -> 2
//        else -> birthday.rem(fortunes.size)
//    }
//    return fortunes[index]
//}

fun getFortune(birthday : Int) : String {
    when (birthday) {
        in 1..5 -> return "vai"
        in 6..10 -> return "vamooo"
        in 11..20 -> return "aeee"
        in 21..31 -> return "foi"
        else -> return "erro"
    }
}

fun getBirthday(): Int {
    print("Qdo é seu aniversário? ")
    var birthday = readLine()?.toIntOrNull() ?: 1
    return birthday

//    print("\nEnter your birthday: ")
//    return readLine()?.toIntOrNull() ?: 1
}