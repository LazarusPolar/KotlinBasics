package Seccion7

fun suma(num1: Int, num2: Int): Int {
    val suma = num1 + num2
    return suma
}

fun sinParametros(): Unit {
    println("Hola, no tengo parametros")
}

//La funcion main tiene el tipo de dato de retorno "Unit" que, para fines practicos
//es parecido al "void" en C
fun main(args: Array<String>)/* :Unit */{
    val resultado = suma(2,3)
    sinParametros()
    println(resultado)
}