fun main(args: Array<String>) {
    val lista = crearLista()
    var contenidoString = ""
    var sumatorioDouble = 0.0
    lista.forEach {
        when (it) {
            is String -> contenidoString += "$it "
            is Double -> sumatorioDouble += it
            is Int -> sumatorioDouble += it
        }
    }
    println("La lista contiene $lista")
    println("El contenido contiene $contenidoString")
    println("El sumatorio contiene $sumatorioDouble")

}

fun crearLista(): List<Any> {
    return listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")
}