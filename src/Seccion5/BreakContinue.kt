package Seccion5

fun main (args: Array<String>){
    for(elemento in 1..5){
        if(elemento == 3){
            //continue
            break
        }
        println(elemento)
    }

    //loop@ rompe el bloque for externo
    //Se debe poner break@loop para que se rompa el ciclo
    loop@for(contador in 1..2){
        for(contador2 in 1..5){
            println("Contador: $contador")
            if(contador2 == 2){
                break@loop
            }
        }
    }
}