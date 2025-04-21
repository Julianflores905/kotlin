package `5_estructuras_condicionales_anidadas`

/*Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y
 la cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel
  del mismo según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que

  Nivel máximo: Porcentaje >= 90%.
	Nivel medio: Porcentaje >= 75% y < 90%.
	Nivel regular:	Porcentaje >= 50% y 75%.
	Fuera de nivel:Porcentaje < 50%.


 */

fun main() {

        print("Ingrese la cantidad de preguntas: ")
        val Preguntas = readln().toInt()
        print("Ingrese las respuestas correctas: ")
        val Correctas = readln().toDouble()

        val porcentaje = (Correctas / Preguntas.toDouble()) * 100

    if (porcentaje >= 90)
        print("nivel maximo")
    else
        if(porcentaje >= 75)
            print("nivel medio")
    else
        if(porcentaje >= 50)
            print("nivel regular")
    else
        print("nivel insuficiente")

    }