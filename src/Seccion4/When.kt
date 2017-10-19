package Seccion4

fun main(args: Array<String>){
    val x = 1

    //SWITCH - CASE
    when (x) {
        1 -> {
            println("Imprime 1")
            println("Codigo sencillo")
        }
        2 -> println("Imprime 2")
        3 -> println("Imprime 3")
        4 -> println("Imprime 4")
        5 -> println("Imprime 5")
        //Rango: Estre entre X y Y
        in 6..15 -> println("Valor entre 6 y 15")
        //Rango: No esta entre X y Y
        !in 6..15 -> println("Valor no esta entre 6 y 15")
        else -> println("Valor fuera de rango")
    }

    val promedio = 10

    //WHEN convertido a una expresion
    val resultado = when(promedio){
        10 -> "Tu resultado es sobresaliente. Calificacion: $promedio"
        9 -> "Tu resultado es bueno. Calificacion: $promedio"
        //Multiples opciones de When
        8, 7, 6 -> "Tu resultado es suficiente. Calificacion: $promedio"
        else -> "Tu resultado es insuficiente. Calificacion: $promedio"
    }

    println(resultado)
}