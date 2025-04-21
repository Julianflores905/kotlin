package `6_condiciones_compuestas_operadores_logicos`

fun main() {
    print("ingrese primer valor: ")
    val uno: Int = readln().toInt()
    print("ingrese segundo valor: ")
    val dos: Int = readln().toInt()
    print("ingrese tercer valor: ")
    val tres: Int = readln().toInt()
    if (uno == dos && dos == tres) {
        val cubo = uno * uno * uno
        print("Los numeros son iguales. el cubo de $uno es $cubo")
    }else{
        print("los numeros no son iguales")
    }
}
