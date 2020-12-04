package ConteudosAula4Classes

abstract class AquariumFish { //Define a cor
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {
    override val color = "gray"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("Much on algae")
    }
}

interface FishAction { //Define Comida

    fun eat()
}