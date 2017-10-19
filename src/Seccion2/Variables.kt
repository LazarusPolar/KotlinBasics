package Seccion2

fun main(args: Array<String>){
  //Declaracion de variables
  //Var es para variables que pueden cambiar su valor en cualquier momento durante la ejecucion del codigo
  //Val no puede cambiar su valor y normalmente se refiere a constantes dentro del codigo

  val PI = Math.PI
  var x: Int = 5
  var y: Int = 8
  val z: Int = x + y;
  var doble : Double = 2.12321312
  var flotante: Float = 2.1312f

  //Impresion de operacion basica (Con concatenacion basica)
  println("El resultado de la operacion es " + z);

  //Algunos tipos de datos
  var nombre : String = "Juan Carlos"
  var edad : Int = 23
  var ciudad : String = "Merida"
  var colonia = "Guerrero"

  //Impresion de datos con concatenacion de datos en Kotlin
  println("Mi nombre es $nombre, tengo $edad años. Vivo en $ciudad con colonia $colonia")

}
