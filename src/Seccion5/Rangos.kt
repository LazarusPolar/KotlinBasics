package Seccion5

fun main(args: Array<String>){

    val nums = 1..50

    //Sustitucion del For por una variale de rango
    for(elemento in nums){
        println(elemento)
    }

    println("***********")

    //Incremento del For personalizado
    for (elemento in nums step 2){
        println(elemento)
    }

    println("***********")

    //Conteo del For en reversa
    for(elemento in nums.reversed()){
        println(elemento)
    }

    println("************")

    val nums2 = 50 downTo 1
    val nums3 = 1 until 16

    //Decremento en un For
    for(elemento in nums2){
        println(elemento)
    }

    //Numero anterior al dado en el until
    for(elementos in nums2){
        println(elementos)
    }

    //Conteo de elementos
    for(elementos in nums3){
        println("El conteo es de ${nums2.count()} elementos")
    }

    //Impresion de caracteres de A la Z y la a a la z
    var chars = 'A'..'z'

    for(elementos in chars){
        println(elementos)
    }
}