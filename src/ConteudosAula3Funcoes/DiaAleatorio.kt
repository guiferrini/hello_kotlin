package ConteudosAula3Funcoes

import java.util.*

fun main(args: Array<String>){
    feedFish()
    eagerExample()
//    var bubbles = 0
//    while (bubbles < 50) {
//        bubbles++
//    }
//
//    repeat(2){
//        println("O peixe esta nadando")
//    }
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant")

    val eager = decorations.filter { it[0] == 'p' } //it = each element
    println(eager) //[pagoda, plastic plant]

    //Apply filer lazily
    // lazy behavior use sequences. Sequences is a collection yahy can only look at one item at a time, staring at beginning to the end
    val filter = decorations.asSequence().filter { it[0] == 'p' }
    println("filter ${filter.toList()}") //filter [pagoda, plastic plant]

    //Apply map lazily
    val lazyMap = decorations.asSequence().map {
        println("map: $it") // imprime tds
         it
    }
    println(lazyMap) // map: pagoda
    println("First: ${lazyMap.first()}") // First: rock
    println("All: ${lazyMap.toList()}") // All: [rock, pagoda, plastic plant]
}

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20) : Boolean {

    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Domingo"

//Lambda

var dirty = 20

val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
fun feedFish(dirty: Int) = dirty + 10

//Função de ordem Superior - função q usa uma função
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor(){
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish) //usa os :: p passar, pq ConteudosAula3.feedFish é uma função nomeada (não um lambda)

    //Sintaxe do ultimo parametro, é onde é passado o Lambda
    dirty = updateDirty(dirty, { dirty ->
        dirty + 50
    })

}



//

fun feedFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Hj é $day e o péixe come $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)

    if(shouldChangeWater(day)){
        println("Change the water today")
    }

    dirtyProcessor()
}

fun randomDay() : String {
    val week = listOf("Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado")
    return week[Random().nextInt(7)] //0..6 são 7 numeros
}

fun fishFood(day: String): String {
    var food = " "

    return when (day) {
        "Domingo" -> "pao"
        "Segunda" -> "trigo"
        "Terça" -> "aveia"
        "Quarta" -> "cevada"
        "Quinta" -> "vento"
        "Sexta" -> "nada"
        "Sábado" -> "miau"
        else -> "hj n come"
    }

//    when (day) {
//        "Domingo" -> food = "pao"
//        "Segunda" -> food = "trigo"
//        "Terça" -> food = "aveia"
//        "Quarta" -> food = "cevada"
//        "Quinta" -> food = "vento"
//        "Sexta" -> food = "nada"
//        "Sábado" -> food = "miau"
//    }
//    return food
}
