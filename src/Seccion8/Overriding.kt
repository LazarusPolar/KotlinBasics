package Seccion8

open class Human(){
    var palabra : String? = null

    //Para poder modificarla se pone el modificador open
    open fun saludo(){
        println("Hola")
    }
}

class Perr() : Humano(){

    //Sobrescribe las funciones de saludo de la superclase "Human"
     override fun saludo(){
        println("Soy un perro")
    }

    fun ladrido(){
        println("Ladrando")
    }
}

fun main(args: Array<String>) {
    var persona = Human()
    var juanito = persona.saludo()

    var perrito = Perr()
    var coco = perrito.saludo()

}