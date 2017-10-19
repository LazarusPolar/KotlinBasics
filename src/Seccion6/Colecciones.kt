package Seccion6

fun main(args: Array<String>){
    //Clave - Valor
    val hashMap = hashMapOf(1 to "Merida")
    hashMap.put(10, "Yucatan")
    println(hashMap[1])

    //Array de Letras. arrayOf es mutable
    val letras = arrayOf("a", "b", "c")
    println(letras[1])
    letras[1] = "z"

    //listOf es inmutable
    val nums = listOf(0, 1, 2, -12)

    for(elementos in nums){
        println(elementos)
    }
}