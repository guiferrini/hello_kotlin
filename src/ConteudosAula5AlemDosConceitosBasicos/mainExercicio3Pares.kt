package ConteudosAula5AlemDosConceitosBasicos

fun main (args: Array<String>) {

    var livros = Livros("vai", "Gui", 2000)
    var getTitulo = livros.tituloAutor()

    println("O livro ${getTitulo.first} do autor ${getTitulo.second}")

}

class Livros(var titulo: String, var autor: String, var ano: Int){

    fun tituloAutor(): Pair<String, String> {
        return (titulo to autor)
    }
}

