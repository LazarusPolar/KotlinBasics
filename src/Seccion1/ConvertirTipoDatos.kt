package Seccion1

fun main(args: Array<String>){
  var numero1 : Int = 5
  var numero2 : Int = 10
  var stringnumer : String = "19"

  //Conversion de cadena a entero
  numero1 = stringnumer.toInt()
  println(numero1)

  //El simbolo ? significa que variable puede o no puede tener ningun valor
  var numero3: Float?

  //Conversion de entero a Float
  numero3 = numero2.toFloat()
  println(numero3)

  var doble : Double?
  //Conversion de entero a Doble
  doble = numero3.toDouble();
  println(doble)

  //Conversion de Double a String
  stringnumer = numero3.toString();
  println(stringnumer)
}
