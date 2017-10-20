package Seccion9

fun main(args: Array<String>){

    try {
        println("Ingresa un numero")
        var num1 = readLine()!!.toInt()
        var division = 50 / num1

        println("La division es $division")
    }catch (e:Exception){
        //println(e.message)
        println("No se pueden hacer divisiones entre 0")
    }

    println("Aplicacion finalizada")
}