package Seccion6

fun main(args: Array<String>){
    val hashMap = HashMap<Int, String>()
    hashMap.put(1,"Merida")
    hashMap.put(200,"Yucatan")
    hashMap.put(0,"CDMX")
    hashMap.put(50,"GDL")

    //Para acceder a la clave del HashMap
    println(hashMap[200])
    println(hashMap.get(200))

    hashMap.put(50, "Jose Almaraz")

    //Devuelve todos los datos del HashMap
    for(clave in hashMap.keys){
        println(hashMap[clave])
    }
}