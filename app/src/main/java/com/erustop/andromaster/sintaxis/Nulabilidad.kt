package com.erustop.andromaster.sintaxis

fun main() {
    var name:String? = null

        println(name?.get(3) ?: "Es nulo wey")
    name = "Reasignado Enyer"

    println(name?.get(0) ?: "Es nulo wey")

}