package Seccion4

fun main (args: Array<String>){
    var num1 : Int = 5
    var num2 : Int = 19
    var resultado: Int?

    // Primera forma de declaracion de if
    if(num1 > num2){
        resultado = num1
    } else {
        resultado = num2
    }

    println("Resultado: $resultado")

    // Declaracion de If dentro de una variable
    resultado = if (num1 > num2){
        num1
    } else {
        num2
    }

    println("Resultado: $resultado")
}