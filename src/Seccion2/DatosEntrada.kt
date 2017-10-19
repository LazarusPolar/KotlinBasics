package Seccion2

fun main(args: Array<String>){

  println("Ingresa un nombre: ")

  //Permite la lectura de variables por consola
  var nombre = readLine()
  println(nombre);

  println("¿Cual es tu edad? ")
  // A readLine() le llegan los datos como String. Habra que agregarse un validador de nuladidad para ello.
  var edad = readLine()!!.toInt()
  println(edad)

}
