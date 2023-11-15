package com.erustop.andromaster.sintaxis

fun main() {
//    inmutableList()
    mutableList()
}


fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    weekDays.add(0,"EnyerDay")
    println(weekDays)

        if (weekDays.isEmpty())
        // No hago nada pues
            else weekDays.forEach{(println(it))}


    if (weekDays.isNotEmpty())
         weekDays.forEach{(println(it))}

}
fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

//    println(readOnly.size)
//    println(readOnly)
//    println(readOnly[0])
//    println(readOnly.first())
//    println(readOnly.last())

    //FILTRAR
//    val example = readOnly.filter { it.contains("a") }
//    println(example)

        //iterar
//    readOnly.forEach{ weeekDay -> (println(weeekDay)) }
}
