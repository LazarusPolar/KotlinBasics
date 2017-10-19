package Seccion6

fun main (args: Array<String>){
    //mutableListOf hace que ListOf pueda modificar sus datos
    val nums = mutableListOf(0, 1, 2, -12)

    nums[2] = 4

    for(elementos in nums){
        println(elementos)
    }

    //setOf es exclusivo de elementos de solo lectura
    //La ventaja es que no se muestran valores repetidos
    val inmutable = setOf(1,2,4,0,2,4,80)

    for(elemento in inmutable){
        println(elemento)
    }

    //setOf mutable. Se le pueden agregar nuevos elementos.
    //Los datos siguen sin repetirse
    val mutable = mutableSetOf(51, 2, 3, 23)
    mutable.add(40)
    mutable.add(23)

    for (elemento in mutable){
        println(elemento)
    }
}