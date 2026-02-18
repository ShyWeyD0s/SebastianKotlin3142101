fun main(args: Array<String>) {
    //Listas en Kotlin
    var readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo") // Lista inmutable
    //metodos propios de las listas
    println(readOnly.size) // Devuelve el tamaño de la lista
    println(readOnly.get(3)) // Devuelve el elemento en la posición 3 (Jueves)
    println(readOnly.contains("Sabado")) // Devuelve true si la lista contiene "Sabado"
    println(readOnly.indexOf("Domingo")) // Devuelve el índice de "Domingo" (6)
    println(readOnly.first()) // Devuelve el primer elemento de la lista (Lunes)
    println(readOnly.last()) // Devuelve el último elemento de la lista (Domingo)
    println(readOnly) // Imprime la lista completa

}