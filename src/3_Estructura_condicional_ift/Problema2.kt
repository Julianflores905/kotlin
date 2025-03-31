package `3_Estructura_condicional_ift`

/*Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)*/

fun main() {
    // Solicitar al usuario que ingrese un número
    print("Ingresa un número entero entre 1 y 99: ")
    val numero = readLine()?.toIntOrNull()

    // Verificar que el número ingresado sea válido y esté dentro del rango
    if (numero != null && numero in 1..99) {
        // Verificar si el número tiene uno o dos dígitos
        if (numero < 10) {
            println("El número tiene un dígito.")
        } else {
            println("El número tiene dos dígitos.")
        }
    } else {
        println("El número no está en el rango de 1 a 99.")
    }
}