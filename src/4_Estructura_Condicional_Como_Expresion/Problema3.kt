package `4_Estructura_Condicional_Como_Expresion`

/*Solicita al usuario que ingrese tres valores enteros positivos que representan los lados de un triángulo. Valida primero que puedan formar un triángulo (la suma de dos lados debe ser mayor al tercero).
Si es válido, guarda en una variable el tipo de triángulo usando una expresión if:
"Equilátero" si los tres lados son iguales.
"Isósceles" si dos lados son iguales.
"Escaleno" si todos los lados son distintos.
Imprime el tipo de triángulo o un mensaje de error si no forman uno válido.*/

fun main() {

    print("Ingresa el primer lado del triángulo: ")
    val lado1 = readLine()?.toInt() ?: 0
    print("Ingresa el segundo lado del triángulo: ")
    val lado2 = readLine()?.toInt() ?: 0
    print("Ingresa el tercer lado del triángulo: ")
    val lado3 = readLine()?.toInt() ?: 0


    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
        println("Error: Los lados deben ser enteros positivos.")
    } else if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

        when {
            lado1 == lado2 && lado2 == lado3 -> println("El triángulo es Equilátero.")
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> println("El triángulo es Isósceles.")
            else -> println("El triángulo es Escaleno.")
        }
    } else {
        println("Error: Los lados no pueden formar un triángulo.")
    }
}