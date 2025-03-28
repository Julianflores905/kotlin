package `2_entrada_de_datos`

fun main(argumento: Array<String>) {
    print("ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de $valor1 y $valor2 es $suma")
    val producto = valor1 * valor2
    println("El producto de $valor1 Y $valor2 es $producto")

}


