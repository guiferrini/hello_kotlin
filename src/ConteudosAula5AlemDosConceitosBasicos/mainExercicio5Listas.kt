package ConteudosAula5AlemDosConceitosBasicos


fun main (args: Array<String>) {

    val allBooks: Set<String> = setOf<String>("livro A", "Livro B", "Hamlet")

    val autorWillian: String = "Willian"

    val library = mapOf(allBooks.first() to autorWillian)

    println(library) // {livro A=Willian}

    println(allBooks.any { it.contains("Hamlet") }) //true

    val moreBooks = mutableMapOf("Willian" to 1, "Willian" to 2)
    val moreBooks2 = mapOf<String, String>("Willian" to "Hamlet", "Willian" to "libro C")

    moreBooks.put("Willian", 3)
//    moreBooks.getOrElse("livro D") { moreBooks.put("Livro D", 3) }
//    if (!moreBooks.("livro D")){
//        moreBooks.put()
//    }
    println(moreBooks)
}