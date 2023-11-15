package com.erustop.andromaster.sintaxis

val age = 23

fun main() {
//TODO val es una constante y var es una variable
    print("Mi primer hola Mundo en Kotlin :) \n")

    val name = "Erustop Rangel"


    /**
     * Variables alfanumericas
     */

    //Char
    val charExcample1: Char = 'L'
    val charExcample2: Char = '2'
    val charExcample3: Char = '@'
    val stringExample: String = "Sisas jejeje puede ser lo que sea"


//    String
    println("$stringExample soy $name y tengo $age anios jijiji")





    showMyName(name)
    variablesNumericas()
}


fun showMyName(name:String) {
    println("Hola me llamo $name")
}

fun showMyAge(age: String) {
    println("------------------------")
    println("Tengo $age anios de edad")
    println("------------------------")
}

fun variablesNumericas() {

    var age1: Int = 23
    showMyAge(age1.toString())

    val example: Long = 656565659959595

    val floatExample: Float = 30.5f

    val doubleExample: Double = 13213213.131416516


    age1 = 45

    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false



    println("Sumar:")
    println(age + age1)


    var example123: String = age.toString()




    println("ahora mi edad es un string y es $example123")

//    Log.w("ENYER","Probando como se ve un log en Kotlin jiji") // No sirve aun xd

}