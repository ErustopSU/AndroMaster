package com.erustop.andromaster.sintaxis

fun main() {
    var name:String = "Enyer"

    val weekDays= arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

//    println(weekDays[0])

    weekDays[0] = "Feliz Lunes"

//    println(weekDays[0])
//
//    println(weekDays.size)


//    if (weekDays.size >= 8)
//        println(weekDays[7])
//    else println("No hay mas valores en el array")
//

    /// Bucles para Arrays

    for (position in weekDays.indices){
//        println("Pasando por el ${weekDays[position]}")
    }

    for(weekDay in weekDays)
        println("Ahora es $weekDay")

}