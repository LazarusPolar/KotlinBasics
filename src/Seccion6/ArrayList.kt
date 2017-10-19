package Seccion6

fun main(args: Array<String>){
    val arrayList = ArrayList<String>()
    arrayList.add("Uva")
    arrayList.add("Manzana")
    arrayList.add("Pera")

    println("El elemento en la posicion tres es: " + arrayList[2])

    println("Todos los elementos son: ")

    for(elemento in arrayList){
        println(elemento)
    }

    println("Todos los elementos por indice son: ")
    for(fruta in 0..2){
        println(arrayList[fruta])
    }

    arrayList[1] = ("Fresa")
    arrayList.set(0, "Platano")
    arrayList.add("Fresa")

    println(arrayList)

    if(arrayList.contains("Platano")){
        println ("Se ha encontrado")
    } else {
        println("No se ha encontrado ")
    }

    for(tamanoDesconocido in 0..arrayList.size - 1){
        println(arrayList[tamanoDesconocido])
    }
}