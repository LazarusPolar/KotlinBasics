package Seccion7

//Sobrecarga de funciones
fun sum(num1: Int, num2: Int): Int {
    val suma = num1 + num2
    return suma
}

fun sum(num1: Int, num2: Int, num3: Int): Int {
    val suma = num1 + num2 + num3
    return suma
}

fun sum(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    val suma = num1 + num2 + num3 + num4
    return suma
}

fun main(args: Array<String>){

    val resultado = sum(1,3,4,7)
    println(resultado)
}