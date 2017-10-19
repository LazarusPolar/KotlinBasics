package Seccion5

fun main (args: Array<String>){

    var contador = 1

    do {
        println("El valor actual de contador es: $contador")
        contador+= 2
    } while(contador <= 5)

    println("Ciclo While Terminó")
}