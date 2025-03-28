package `2_entrada_de_datos`

/*Realizar un programa que lea por teclado cuatro valores numéricos enteros e informe su suma y promedio.*/

fun main(){
    print("ingrese el primer promedio: ")
    val valor1 = readln().toInt()
    print("ingrese el segundo promedio: ")
    val valor2 = readln().toInt()
    print("ingrese el tercer promedio: ")
    val valor3 = readln().toInt()
    print("ingrese el cuarto promedio: ")
    val valor4 = readln().toInt()
    val promedio = valor1 + valor2 + valor3 + valor4 / 4
    println("Su promedio es $promedio")

}