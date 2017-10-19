package Seccion6

import java.util.*

fun main(args: Array<String>){
    val nums = listOf(1, 2, 3, 4, 5, 6)

    for(elementos in nums){
        println(elementos)
    }

    for ((indice, elementos) in nums.withIndex()){
        println("$indice : $elementos")
    }

    val map = TreeMap<String, Int>()
    map["Seven"] = 27
    map["Ocho"] = 28

    for((nombre, edad) in map){
        println("$nombre : $edad")
    }

}