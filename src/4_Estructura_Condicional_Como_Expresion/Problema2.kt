package `4_Estructura_Condicional_Como_Expresion`

/*olicita al usuario que ingrese su edad. Almacena una descripción en una variable usando una expresión if:
Si es menor de 13, asigna "Niño".
Si está entre 13 y 17 inclusive, asigna "Adolescente".
Si es 18 o más, asigna "Adulto".*/


fun main() {
    print("ingrese su edad")
    val edad = readln().toInt()
    val Edad = if (edad < 13) {
        print("niño")
    } else {
        val Edad = if (edad <= 13) {
            print("adolecente")
        } else {
            val Edad = if (edad > 18) {
                print("adulto")
            } else {
            }
        }
    }
}

