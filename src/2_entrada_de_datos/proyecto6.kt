package `2_entrada_de_datos`

fun main(){
    print("ingrese la dedida de lado del cuadrado: ")
    val lado = readln().toInt()
    val perimetro = lado * 4
    println("El perimetro de cuadrado es $perimetro")

}