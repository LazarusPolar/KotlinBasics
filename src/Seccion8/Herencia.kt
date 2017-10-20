package Seccion8

//Con esto se puede acceder a la extension a otras clases
open class Humano(){
    //Todas las variables en Kotlin son publicas
    var palabra : String? = null
    //No se puede hacer una instancia de la variable
    //protected var palabra : String? = null
    //Solo quien este dentro de la clase principal puede ver esta variable
    //private var palabra : String? = null

    open fun saludo(){
        println("Hola")
    }
}

//Solo se puede heredar de una clase una sola vez
class Perro() : Humano(){
    fun ladrido(){
        println("Ladrando")
    }

    fun getPalabra(){
        //Manda a llamar a la superclase
        super.palabra
    }
}

class Gato() {
    fun maullido(){
        println("Miau")
    }
}

fun main(args: Array<String>) {
    var persona = Humano()
    var juanito = persona.saludo()

    var perrito = Perro()
    var coco = perrito.saludo()

    println(persona.palabra)
}