package ConteudosAula4Classes.Decorations

import ConteudosAula4Classes.Spice

data class SpiceContainer(var spice: Spice) {
    val label = spice.nome
}

//val spiceCabinet = listOf(
//        SpiceContainer(Spice("curry", "media")),
//        SpiceContainer(Spice("pepper", "alta")),
//        SpiceContainer(Spice("cayenne", "impossivel"))
//)
//for(element in spiceCabinet) println(element.la)

