package Seccion2

fun main(args: Array<String>){

  //Concatenacion basica de cadenas en Kotlin
  val nombre = "Diego "
  val apellido = "Almaraz " + "Gonzalez"
  println(nombre + apellido);

  //Char y String no son lo mismo
  //Se puede acceder al indice de una cadena ya que, a final de cuentas, es un array de Chars
  val ciudad : Char = 'a'
  println("La primera letra del abecederio es $ciudad")
  println("La segunda letra de nombre es " + nombre[2])

}
