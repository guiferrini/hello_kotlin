package ConteudosAula4Classes

import kotlin.math.PI

open class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {

//    fun volume(): Int {
//        return width * height * length / 1000
//    }
// Podemos fazer diferente no Kotlin, 1° declara a função, 2° define 'get' function
open var volume : Int
        get() {
            return width * height * length / 1000
        }
    //pode ser - public set(value)
    set(value) {height = (value * 1000) / (width * length)} //Altera de litros p centimetro cubico
    //ou get() = width * height * length / 1000

    open var water = volume * 0.9

    constructor(numberOfFish: Int): this() {

        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = water + water * 0.1
        height  = (tank / (length * width)).toInt()
    }
}

class TowerTank(): Aquarium() {

    override var water = volume * 0.8

    override var volume: Int
    get() = (width * height * length / 1000 * PI).toInt() //tem q converter p Int (integer), pq PI é Int
        set(value) {
            height = (value * 1000) / (width * length)
        }

}