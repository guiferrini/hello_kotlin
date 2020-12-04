package ConteudosAula5AlemDosConceitosBasicos

fun main(args: Array<String>){

    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures.get("white spots")) // Ich
    println(cures["white spots"]) // Ich

    println(cures.getOrDefault("none", "Sorry I don't know")) // se n tem o q procura, impre algo por padrao

    cures.getOrElse("bloating") { "No cure for this" }

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")

    println(inventory)
}