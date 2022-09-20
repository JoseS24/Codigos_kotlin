/*Alumno: Jose Simon Diaz Hernandez
No.control: 192T0209
Actividad: 1.-  Dado un Array ordenado de menor a mayor,  remover los elementos duplicados del array.
input [1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6]
output[1,2,3,4,5,6]
*/
fun main (){

    val arreglo = arrayOf(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6)

    println("El arreglo original es: ${arreglo.contentToString()}")
    arreglosinRepetir(arreglo)

    }

fun arreglosinRepetir(arreglo: Array<Int>) {

    println("El arreglo sin repetir es: ${arreglo.distinct()}")

}