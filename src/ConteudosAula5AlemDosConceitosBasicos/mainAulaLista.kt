package ConteudosAula5AlemDosConceitosBasicos

fun main (args: Array<String>) {
    val testList = listOf(11, 12, 13, 14, 15)

    println(testList.reversed())
//    println(reverseList(testList)) //forma tradicional, em Kotlin só um comando...
}

//fun reverseList(list: List<Int>): List<Int> {
//    val result = mutableListOf<Int>()
//    for(i in 0..list.size-1) {
//        result.add(list[list.size-i-1])
//    }
//    return result
//}

//fun reverseListAgain(list: List<Int>): List<Int> {
//    val result = mutableListOf<Int>()
//    for(i in list.size -1 downTo 0) {
//        result.add(list.get(i))
//    }
//    return result
//}