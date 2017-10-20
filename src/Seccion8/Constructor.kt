package Seccion8

class Person(){
    var nombre : String? = null
    var edad: Int? = null
    var altura: Double? = null
    var peso: Double? = null
    var colorOjos: String? = null
    var genero: String? = null

    constructor(nombre: String, edad: Int, altura: Double, peso: Double, colorOjos: String, genero: String): this() {

        this.nombre = nombre
        this.edad = edad
        this.altura = altura
        this.peso = peso
        this.colorOjos = colorOjos
        this.genero = genero
    }

    fun GetNombre(): String? {
        return this.nombre
    }

    fun GetGenero(): String? {
        return this.genero
    }
}

fun main(args: Array<String>){
    var person = Person("Jose", 12,1.50,78.6, "Cafes","Masculino")
    println("El nombre es: " + person.GetNombre())
    println("El genero es: " + person.GetGenero())

    var person2 = Person("Luis", 16,1.60,79.6, "Cafes","Masculino")
    println("El nombre es: " + person2.GetNombre())
    println("El genero es: " + person2.GetGenero())
}