package Seccion6

fun main (args: Array<String>){
    val array = Array<Int>(5){0}
    array[1] = 2
    array[2] = 4
    array[3] = 5
    array[4] = 4

    println("Array en la posicion 3 es: " + array[3])

    //Muestra todos los elementos del ARRAY
    for(elementos in array){
        println(elementos)
    }

    println("Termina la busqueda de valores por objeto")

    for(indice in 0..4){
        println(array[indice])
    }

    println("Se termino la busqueda de valores por indice")


    val fruta = Array<String>(2){""}

    for(indice in 0..1){
        print("Ingresa la fruta del indice [$indice]")
        fruta[indice] = readLine()!!
    }

    for(indice in 0..1){
        println("La fruta en el indice [$indice] es: " + fruta[indice])
    }

}