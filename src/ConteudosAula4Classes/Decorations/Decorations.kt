package ConteudosAula4Classes.Decorations

fun main (args: Array<String>) {
    makeDecorations()
}

fun makeDecorations() {

    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("Slate")
    println(d2)

    val d3 = Decorations("Slate")
    println(d3)

    println(d1.equals(d2)) //false
    println(d2.equals(d3)) //true

    val d4: Decorations = d3.copy()
    println(d3)
    println(d4)

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val(rock: String, wood: String, diver: String) = d5
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations (val rocks: String)  {} //cria um 'toString', imprime o valor/propriedade

data class Decoration2(val rocks: String, val wood: String, val dive: String){}