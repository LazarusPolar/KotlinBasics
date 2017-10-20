package Seccion8

//Clase generica representada con la letra T
class Numeros<T>(numero:T){
    init{
        println(numero)
    }
}

fun <T> imprimir(texto: T){
    println(texto)
}

fun main(args: Array<String>){
    var numero1 = Numeros<Int>(23)
    var numero2 = Numeros<Float>(23.4223f)
    var numero3 = Numeros<Double>(23.1321312312)

    imprimir<Int>(12)
    imprimir<Double>(12.123)
    imprimir<Float>(12.123213123f)
}