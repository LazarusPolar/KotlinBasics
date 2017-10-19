package Seccion2

fun main(args: Array<String>){
  //Variable puede ser o no ser nula con el simbolo ?
  val nombre :String?
  nombre = "Jose"

  //Necesita forzosamente tener un valor  que no sea null con los simbolos !!
  println(nombre!!)
}
