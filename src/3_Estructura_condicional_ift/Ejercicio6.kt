package `3_Estructura_condicional_ift`

fun main(){
    print("ingrese el primer valor ")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor")
    val valor2 = readln().toInt()
    if (valor1 > valor2) {
        print("El mayor valor es $valor1")
    }
    else{
        print("el mayor valor $valor2")
    }
}