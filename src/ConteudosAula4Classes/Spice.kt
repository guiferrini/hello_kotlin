package ConteudosAula4Classes

import ConteudosAula4Classes.Decorations.SpiceContainer

class Spice (var nome: String, var picancia: String = "media") {

    var heat : Int
        get() {
            return when (picancia) {
                "baixa" -> 1
                "media" -> 3
                "alta" -> 5
                "impossivel" -> 7
                else -> 0
            }
        }
        set(value) {}

    init {
        println(spices1)
    }

    val intencidadeDaPicancia = spices1.filter { it.heat < 5 }
}

val spices1 = listOf(
        Spice("curry", "media"),
        Spice("pepper", "alta"),
        Spice("cayenne", "impossivel"),
        Spice("ginger", "baixa")
)

fun makeSlat(){
    var sal = Spice("sal", "baixa")
}

val spiceCabinet = listOf(
        SpiceContainer(Spice("curry", "media")),
        SpiceContainer(Spice("pepper", "alta")),
        SpiceContainer(Spice("cayenne", "impossivel"))
)

//for(element in spiceCabinet) println(element.label)

