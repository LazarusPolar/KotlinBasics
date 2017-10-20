package Seccion8

//Uso de extensiones para la clase ArrayList
fun ArrayList<String>.intercambiar(indice1: Int, indice2: Int){
    var temporal = this.get(indice1)
    this.set(indice1, this.get(indice2))
    this.set(indice2, temporal)
}

fun main(args: Array<String>){

    var arrayList = ArrayList<String>()
    arrayList.add("Jose")
    arrayList.add("Alo")
    arrayList.add("Hola")

    println(arrayList)

    arrayList.intercambiar(0,1)
    println(arrayList)
}