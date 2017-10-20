package Seccion7

fun polimorfismo(num1: Int): Unit{
    println("El numero es $num1")
}

fun polimorfismo(num1: Double): Unit{
    println("El numero es $num1")
}

fun polimorfismo(num1: Float): Unit{
    println("El numero es $num1")
}

fun polimorfismo(num1: String): Unit{
    println("El nombre es $num1")
}

fun main(args: Array<String>){
    //Poliformismo. Varias funciones con el mismo nombre pero diferente tipo de parametros
    polimorfismo(1)
    polimorfismo(2.1)
    polimorfismo(2.223)
    polimorfismo("Hola")
}