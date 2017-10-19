package secciondos

fun main (args: Array<String>){
    val num1 = 10
    val num2 = 10
    val num3 = 5
    val resultado : Int?

    // Jerarquia de operaciones
    // Primero se ejecutan las funciones sobre ()
    // Posteriormente %, *, /
    // Por ultimo +, -
    resultado = num1 + num2 * num3 % 1

    println("El resultado es $resultado")
}