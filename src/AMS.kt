import java.util.*

//AMS - Aquarium Management System

fun main(args: Array<String>){
    //println("Hello Wolrd :) ")
    //dayOfWWeek()

//    val temp = 10
//    val ConteudosAula3.isHot = if (temp > 50) true else false
//    println(ConteudosAula3.isHot)
//
//    val txt = "O peixe esta ${ if (temp > 50) "frito" else "nadando" }"
//    println(txt)

}

fun dayOfWWeek(){
    println("Que dia da semana é hoje?")
    var dia = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(dia){
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sábado")
        else -> println("ERRO")
    }
}