package com.erustop.andromaster.sintaxis

fun main() {
ifBasico("jaskjda")
    getMonth(11)
    getTrimester(6)
    getSemester(11)
    result(getSemester(3))
    result(getSemester2(12))
}

fun ifBasico(name:String){
    if (name == "Enyer")
        println("El nombre es $name")
    else println("el Nombre ahora es $name")
}

fun getMonth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiemre")
        10 -> println("Octubre")
        11 ->{println("Noviembre")
        println("Mes 11")
        }
        12 -> println("Diciembre")
        else -> println("No es un mes válido")
    }

}

fun getTrimester(month:Int){
        when(month){
        1, 2, 3 -> println("Primer Trimestre")
        4, 5 ,6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("No es un trimestre válido")
    }
}


fun getSemester(month:Int): String{
    val result = when(month){
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Semestre"
        else -> "No es un Semestre válido"
    }
    return result
}

fun getSemester2(month:Int): String{
    return when(month){
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Semestre"
        else -> "No es un Semestre válido"
    }
}


fun result(value:Any){
    when(value){
        is Int -> println("Hola, entramos en resultInt y es: $value")
        is String -> println("Hola, entramos en resultString y es: $value")
        is Boolean -> if (value) print("es True") else println("Es False :(")
    }
}