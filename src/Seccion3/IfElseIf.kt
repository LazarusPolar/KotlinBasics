package Seccion3

fun main(args: Array<String>){

    println("¿Que calificacion obtuvo en variables?")
    val calVar : Int = readLine()!!.toInt()
    println("¿Que calificacion obtuvo en operaciones?")
    val calOp : Int = readLine()!!.toInt()
    println("¿Que calificacion obtuvo en logicos?")
    val calLog : Int = readLine()!!.toInt()
    println("¿Que calificacion obtuvo en condiciones?")
    val calCond: Int = readLine()!!.toInt()

    val calificacionFinal = (calCond + calLog + calOp + calVar) / 4

    if(calificacionFinal == 10){
        println("Tu resultado es sobresaliente. Calificacion: $calificacionFinal")
    } else if (calificacionFinal == 9){
        println("Tu resultado es bueno. Calificacion: $calificacionFinal")
    } else if (calificacionFinal in 6..8){
        println("Tu resultado es suficiente. Calificacion: $calificacionFinal")
    } else {
        println("Tu resultado es insuficiente. Calificacion: $calificacionFinal")
    }
}