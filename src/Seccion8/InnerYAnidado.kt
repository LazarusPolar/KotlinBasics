package Seccion8

//Clase anidada
class Externa{
    private val nombre: String? = null

    //Poniendo el modificador Inner se pueden acceder a variables
    //externas de la clase hijo anidada a la clase padre
    inner class Anidada{
        fun mostrar(){
            println("Soy una clase anidada")
            println(nombre)
        }
    }
}

fun main(args: Array<String>){
    var externa = Externa()
    //Antes: var anidada = Externa.Anidada() //Al momemtno de poner el modificador "inner" se agrega parentesis a la clase padre.
    var anidada = Externa().Anidada()
    anidada.mostrar()
}