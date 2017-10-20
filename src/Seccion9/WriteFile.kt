package Seccion9

import jdk.jfr.events.FileReadEvent
import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>){

    println("Opcion 1 para leer. \n Opcion 2 para escribir")
    var opcion = readLine()!!.toInt()

    when(opcion){
        1 -> leerArchivo()
        2 -> {
            println("Escribe tu texto")
            var texto: String = readLine()!!.toString()
            escribirArchivo(texto)
        }
        else -> println("Opcion no valida")
    }

}

fun escribirArchivo(texto: String){
    try {
        var archivo = FileWriter("prueba.txt", true)
        archivo.write(texto + "\n")
        archivo.close()
        println("Se ha guardado correctamente")
    } catch(e: Exception){
        println("Ocurrio un error al escribir el archivo")
    }

}

fun leerArchivo(){
    try{
        //Lectura de letra por letra y se convierte en caracter
        var leer = FileReader("prueba.txt")
        var caracter : Int?

        do{
            caracter = leer.read()
            print(caracter.toChar())
        } while (caracter != -1)
    } catch (ex: Exception){
        println(ex.message)
    }
}