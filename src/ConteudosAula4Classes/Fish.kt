package ConteudosAula4Classes

class Fish (val friendly: Boolean = true, volumeNeeded: Int) { //se n diz se é 'val' ou 'var' n cria propriedade
    //init -> works like a constructor
    val size: Int

    init {
        println("first init block")
    }

    constructor() : this(true, 9){
        println("running secondary constructor")
    }

    init {
        if (friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }
}

fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish  =Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}