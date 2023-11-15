package com.erustop.andromaster.excercises

/**
 * Por lo general, el teléfono te proporciona un resumen de las notificaciones.
 *
 * En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste. El mensaje debe incluir lo siguiente:
 *
 * La cantidad exacta de notificaciones cuando haya menos de 100
 * 99+ como cantidad de notificaciones cuando haya 100 o más
 * */

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
//    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {

    //El when se utiliza para mas de 3 casos, pero como este es mas cortito, se usa un if
//    when(numberOfMessages){
//        in 1..99 -> println("Tu tienes $numberOfMessages notificaciones :)")
//        else -> println("¡Tu teléfono está explotando! Tienes más de 99 notificaciones!!!")
//    }

    if (numberOfMessages > 99)
        println("¡Tu teléfono está explotando! Tienes más de 99 notificaciones!!!")
    else println("Tu tienes $numberOfMessages notificaciones :)")
    // Fill in the code.
}
