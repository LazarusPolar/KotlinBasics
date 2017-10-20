package Seccion8

//La posicion inicia desde 0 como en un Array
enum class Meses {
    ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC
}

fun main(args: Array<String>){
    var sextoMes = Meses.JUN
    var primerMes = Meses.ENE

    //Nombre del valor en el enum
    println("Nombre: " + sextoMes.name)
    //Posicion de la constante
    println("Posicion: " + sextoMes.ordinal)

    //Nombre del valor en el enum
    println("Nombre: " + primerMes.name)
    //Posicion de la constante
    println("Posicion: " + primerMes.ordinal)

    //Compara segun en el orden en el cual estan separadas dichas constantes
    println("Comprar: " + sextoMes.compareTo(primerMes))
    println("Comprar: " + primerMes.compareTo(sextoMes))

    //Enlista todos los valores del enumerador
    for(item in Meses.values()){
        println(item)
    }
}