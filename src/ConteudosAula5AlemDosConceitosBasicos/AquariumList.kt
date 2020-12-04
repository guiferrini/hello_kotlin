package ConteudosAula5AlemDosConceitosBasicos

fun main(args: Array<String>) {

    val symptoms = mutableListOf("white spots", "red spots", "not eating")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red") //false
    symptoms.contains("red spots") //true

    println(symptoms.subList(2, symptoms.size)) //not eating

    listOf(1, 5, 3).sum() //9

    listOf("a", "b", "cc").sumBy { it.length } // 4 - soma os caracteres
}