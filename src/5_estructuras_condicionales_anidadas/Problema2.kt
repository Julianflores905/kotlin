package `5_estructuras_condicionales_anidadas`
/*Confeccionar un programa que permita cargar un número entero positivo de hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
 Mostrar un mensaje de error si el número de cifras es mayor.*/





fun main() {
print("ingrese un numero")
val num = readln().toInt()

if (num <= 9)
    print("su numero tiene 1 digito")
    else
        if (num <= 99)
            print("su numero tine 2 digitos")
    else
        if (num <= 999)
            print("su numero tiene 3 digitos")
    else
        print("error")
}