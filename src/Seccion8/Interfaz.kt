package Seccion8

interface Operacion {
    //Abstract refiere a que la funcion no tiene cuerpo
    //No se pueden crear objetos a partir de una clasa abstracta
    fun sum(num1: Int, num2: Int): Int
    fun div(num1: Int, num2: Int)
    //Funcion implementada dentro de la interfaz
    fun multiplicar(num1: Int, num2: Int): Int{
        return num1 * num2
    }
}

class Oper(): Operacion {
    override fun div(num1: Int, num2: Int) {
        println("La division es: " + num1/num2)
    }

    override fun sum(num1: Int, num2: Int): Int {
        return (num1 + num2) * 3
    }

}

fun main(args: Array<String>){
    var operacion= Oper()
    var miOperacion = operacion.multiplicar(1,2)

    println(miOperacion)
}