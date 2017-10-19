package Seccion3

fun main(args: Array<String>){
    //Evaluaciones sobre impresion (Devuelven un valor booleano)
    //Se usan operadores de comparacion en donde
    // > - Mayor que
    // < - Menor que
    // == - Igual a
    // <= - Menor o igual
    // >= - Mayor o igual
    // != - No es igual a
    // && - Condicion "Y"
    // || - Condicion "O"
    // ! - Condicion "NOT"

    // Uso de operadores relacionales
    println(8<15)
    println(8>15)
    println(5 == 5)

    // Uso de condicion "Y"
    println(2>3 && 5>20)
    println(2>=3 && 3<=23)

    val numero: Int = 100
    val numero2: Int = 101

    // Uso de condicion "O"
    println(numero <= numero2 || 10 > 20)

    // Uso de condicion "NOT"
    val condicion: Boolean = true
    println(!condicion)
}