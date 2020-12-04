package ConteudosAula4Classes

object MobyDickWhale {
    val author = "Herman Malville"

    fun jump(){
        //...
    }
}

enum class Color(val rgb: Int) {
    RED(rgb = 0xFF0000),
    GREEN(rgb = 0x00FF00),
    blue(rgb = 0x0000FF)
}

sealed class Seal

class SealLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "Walrus"
        is SealLion -> "SealLion"
    }
}