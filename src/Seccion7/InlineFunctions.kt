package Seccion7

fun main(args: Array<String>){
    val resultado = summa(1,4)
    println(resultado)

    val result = max(4,2)
    println(result)
}

fun sumar(a:Int, b:Int) : Int {
    return a+b
}

//Inline Function
fun summa(a:Int, b:Int): Int = a + b


fun maxim(num1: Int, num2: Int): Int {
    if(num1 > num2){
        return num1
    } else {
        return num2
    }
}

//Inline function
fun max(num1: Int, num2: Int) : Int = if(num1>num2) num1 else num2