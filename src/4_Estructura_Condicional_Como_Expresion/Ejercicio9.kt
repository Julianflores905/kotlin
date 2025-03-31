package `4_Estructura_Condicional_Como_Expresion`

fun main() {
    print("Ingrese un valor entero: ")
    val valor1 = readln().toInt()
    val resultado = if (valor1 % 2 == 0) {
        print("cuadrado")
        valor1 * valor1
    } else {
        print("cubo")
        valor1 * valor1 * valor1
    }
    print(resultado)
}




