package ConteudosAula4Classes

open class Book (val titulo: String, var autor: String){

    private var currentPage: Int = 1

    open fun readPage() {
        currentPage++
    }
}

class eBook(titulo: String, autor: String, var formato: String = "text"): Book(titulo, autor){

    private var contaPalavra = 0

    override fun readPage() {
        contaPalavra = contaPalavra + 250
    }

}