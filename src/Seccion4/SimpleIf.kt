package Seccion4

fun main (args: Array<String>){

    println("¿Cual es el sueldo que percibes?")
    val sueldo: Double = readLine()!!.toDouble()

    if (sueldo > 1000) {
        println("Debe de pagar impuestos")
    }
}