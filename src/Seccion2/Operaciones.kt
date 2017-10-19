package secciondos

fun main (args: Array<String>){
    print("Ingresa el primer numero: ")
    val num1 : Int = readLine()!!.toInt()

    print("Ingresa el segundo numero: ")
    val num2 : Int = readLine()!!.toInt()

    // Operaciones basicas en Kotlin
    //val resultado = num1 * num2
    //val resultado = num1 + num2
    //val resultado = num1 - num2
    //val resultado = num1 / num2
    val resultado = num1 % num2

    println("Resultado es $resultado")
}