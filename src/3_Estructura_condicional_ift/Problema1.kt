package `3_Estructura_condicional_ift`

/*Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado"*/
fun main(){
    print("ingrese la tercera nota ")
    val valor1 = readln().toInt()
    print("ingrese la segunda nota")
    val valor2 = readln().toInt()
    print("ingrese la tercera nota")
    val valor3 = readln().toInt()
    val promedio = valor1 + valor2 + valor3
    if (promedio >= 7 )
        println("Promocionado")
}
