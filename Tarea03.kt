/*Alumno: Jose Simon Diaz Hernandez
No.control: 192T0209
3.- Haz un programa que dada una temperatura en grados centígrados, imprima en pantalla qué tipo de ropa podrías usar.
Utiliza la siguiente información para devolver los mensajes que correspondan:
Si la temperatura es  devolver: "Usa un Abrigo hace frío"
Si la temperatura está devolver: "Te irá bien si usas una Chaqueta, el clima es templado"
Si la temperatura es  devolver: "Es mejor que lleves algo ligero, hace calor"
*/

fun main (){

    val frio: ClosedFloatingPointRange<Float> = 10.6F..20.5F
    val templado: ClosedFloatingPointRange<Float> = 20.6F..30.5F
    val caluroso: ClosedFloatingPointRange<Float> = 30.6F..40.5F

    println("Ingrese la temperatura: ")
    val temperatura = readLine()!!.toFloat()
    println("La temperatura es: $temperatura")

    when(temperatura){
        in frio -> println("Usa un abrigo hace frio")
        in templado -> println("Te irá bien si usas una Chaqueta, el clima es templado")
        in caluroso -> println("Es mejor que lleves algo ligero, hace calor")
        else -> println("No se puede determinar la temperatura")
    }
}