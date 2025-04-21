package `5_estructuras_condicionales_anidadas`

/*Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo(cero) o negativo.
*/
fun main() {
    print("ingrese un numero")
    val leyenda = readln().toInt()
    if (leyenda < 0 )
        print("negativo")
    else
        if (leyenda == 0 )
            print("nulo")
    else
        if (leyenda > 0)
            print("positivo")
}
