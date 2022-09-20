/*Alumno: Jose Simon Diaz Hernandez
No.control: 192T0209
Actividad: 2.-  Escribe un programa que simule el inicio de sesión de un usuario.
Mientras el nombre de usuario y la contraseña sean válidos, mostrar un mensaje de bienvenida con su nombre.
En caso contrario mostrar un mensaje que uno de los datos no coincide
*/

fun main() {
     val usuario : String = "admin"
     val contraseña : String = "1234"

        println("Ingrese su usuario")
        val usuario1 = readLine()
        println("Ingrese su contraseña")
        val contraseña1 = readLine()

        if (usuario1 == usuario && contraseña1 == contraseña) {
            println("Bienvenido")
        } else if (usuario1 != usuario && contraseña1 != contraseña) {
            println("Usuario y contraseña incorrectos")
        } else if (usuario1 != usuario) {
            println("Usuario incorrecto")
        } else if (contraseña1 != contraseña) {
            println("Contraseña incorrecta")

        }
}