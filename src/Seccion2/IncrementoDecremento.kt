package secciondos

fun main (args: Array<String>){
    var num1 = 10
    var num2 = 10

    var resultado : Int?

    //Incrementar/Decrementar durante ejecucion de instruccion
    resultado = ++num1 + --num2  % 1

    //Incrementar/Decrementar despues de la ejecucion de instruccion
    //resultado = num1++ + num2-- % 1

    println("El resultado es $resultado")
}