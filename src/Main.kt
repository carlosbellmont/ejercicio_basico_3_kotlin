fun main(args: Array<String>) {
    val lista = crearLista()
    var contenido = ""
    var sumatorio = 0.0
    lista.forEach {
        when (it) {
            is String -> contenido += "$it "
            is Double -> sumatorio += it
            is Int -> sumatorio += it
        }
    }
    println("La lista contiene $lista")
    println("El contenido contiene $contenido")
    println("El sumatorio contiene $sumatorio")

}

fun crearLista(): List<Any> {
    return listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")
}