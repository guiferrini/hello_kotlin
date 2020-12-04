package ConteudosAula3Funcoes
fun main(args: Array<String>){
    var txt = fitMoreFish(10.0, listOf(3, 3, 3))
    println("resposta: ${txt}")
}

fun fitMoreFish(
        tankSize: Double,
        currentFish: List<Int>,
        fishSize: Int = 2,
        hasDecorations: Boolean = true
) : Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}