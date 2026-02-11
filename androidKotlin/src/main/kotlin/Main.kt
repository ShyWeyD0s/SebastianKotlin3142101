//introduccion a kotlin
fun main(args: Array<String>) {

    //imprimir en consola
    println("Hola mundo!")
    println("¿Cómo te llamas?")
    //tipos de datos en kotlin (datos definidos)
    val texto: String = "Kotlin es genial! (cadena de texto definida)" // String
    val num: Int = 42 // Entero especifico
    val decimal: Double = 3.14 // Decimal
    val float: Float = 2.71828f // Decimal, agregar f al final del valor
    val esVerdadero: Boolean = true // Booleano
    var variable = "cadena de texto" // Tipo variable
    val variable1 = 2.71828 // Tipo variable
    //Entrada de datos
    print("Ingresa tu nombre: ")
    val nombre = readLine()
    println("Hello, $nombre!, bienvenido a Kotlin. $texto")
    println("Ingresa un numero para probar la conversion de datos: ")
    val numero = readLine()?.toIntOrNull() ?: 0 // Convertir input to Int or use 0 if null
    val operacion = numero * 2
    println("El resultado de la operación de $numero por 2 es: $operacion")
    //funciones
    print("Prueba de funciones")
    imprimirSaludo()
    saludoCumpleanos("Carlos", 25) //en este caso
//llamamos a la funcion con los parametros y asignamos las variables
    print(birthdayGreeting("Carlos", 25))
    print(sumar(2, 1))
}

fun imprimirSaludo (){

    println("Hola, bienvenido a Kotlin!")

}
fun saludoCumpleanos (name: String, age: Int) {
    val nameGreeting = "Feliz cumpleaños, $name!"
    val ageGreeting = "tienes 5 años!"
    println("$nameGreeting $ageGreeting")
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
   return "$nameGreeting\n$ageGreeting"
}
//Funcion para sumar dos numeros enteros y retornar el resultado
fun sumar(a: Int, b: Int): Int {
    return a + b
}