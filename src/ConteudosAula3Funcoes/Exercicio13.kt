package ConteudosAula3Funcoes
fun main(args: Array<String>){
    println(whatShouldIDoToday("Happy")) //go for a walk
    println(whatShouldIDoToday("asd", temperature = 30)) //go swimming
    print("How do you feel? ")
    println(readLine()?.let { whatShouldIDoToday(it) }) //alternativa println(ConteudosAula3.whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(
        mood: String,
        weather: String = "Sunny",
        temperature: Int = 24
): String {
    return when {
        isHappy(mood) && isSunny(weather) -> "go for a walk"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        isHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "watch a movie"
        else -> "Stay home and read a book"
    }
}

fun isHappy(mood: String) = mood == "Happy"
fun isSunny(weather: String) = weather == "Sunny"
fun isHot(temperature: Int) = temperature > 25
fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
        mood == "sad" && weather == "rainy" && temperature == 0
