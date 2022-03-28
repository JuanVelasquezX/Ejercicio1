package view
import controller.PersonaController
import model.Persona
import java.util.Scanner

class PersonaView : PersonaController() {
    fun mainView(){
        val controller = PersonaController()
        val reader = Scanner(System.`in`)
        println("Para iniciar, inserte los siguientes datos: ")

        print("Nombre: ")
        val auxNombre = readLine()!!

        print("Edad: ")
        val auxEdad:Int = reader.nextInt()

        print("Cedula: ")
        val auxCedula:Int = reader.nextInt()

        print("Sexo: ")
        val auxSexo = readLine()!!

        print("Peso: ")
        val auxPeso:Float = reader.nextFloat()

        print("Altura: ")
        val auxAltura:Float = reader.nextFloat()

        val p1 = Persona(auxNombre, auxEdad, auxCedula, auxSexo, auxPeso, auxAltura)

        val p2 = Persona(auxNombre, auxEdad, auxSexo)

        val p3 = Persona()

        println("Medicion de Peso")
        print("Persona 1: ")
        controller.calcularIMC(p1)
        print("Persona 2: ")
        controller.calcularIMC(p2)
        print("Persona 3: ")
        controller.calcularIMC(p3)
        println("")
        println("Mayoria de Edad")
        print("Persona 1: ")
        controller.esMayorDeEdad(p1)
        print("Persona 2: ")
        controller.esMayorDeEdad(p2)
        print("Persona 3: ")
        controller.esMayorDeEdad(p3)

        println("")

        println("Datos Persona 1: ")
        controller.toString(p1)
        println("")
        println("Datos Persona 2: ")
        controller.toString(p2)
        println("")
        println("Datos Persona 3: ")
        controller.toString(p3)
        println("")
    }
}