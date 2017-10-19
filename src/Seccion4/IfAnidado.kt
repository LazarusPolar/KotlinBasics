package Seccion4

fun main(args: Array<String>){
    println("Ingresa la medida en metros")
    val medida : Double = readLine()!!.toDouble()

    if(medida >= 1.0){
        if(medida > 5.0){
            println("La medida $medida sobrepasa los limites aceptados")
        } else {
            println("La medida $medida es aceptable")
        }
    } else {
        println("Lo siento, no es aceptable: $medida")
    }
}