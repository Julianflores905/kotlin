package `4_Estructura_Condicional_Como_Expresion`

/*Solicita al usuario ingresar dos números enteros (pueden ser negativos).
Luego, determina cuál de los dos tiene mayor valor absoluto y muestra ese número en pantalla.
 */
fun main(){
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor")
    val valor2 = readln().toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El mayor es $mayor")
}
