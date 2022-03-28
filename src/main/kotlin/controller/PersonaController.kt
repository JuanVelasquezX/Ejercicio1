package controller
import model.Persona
import kotlin.math.pow

open class PersonaController : Persona() {

    fun calcularIMC(p : Persona): Int {
        val imcTotal = p.getPeso()/(p.getAltura().pow(2))
        var estado = 0

        if(imcTotal < 18.5){
            estado = -1
            println("Estado: Bajo de Peso")
            return estado
        }
        else if (imcTotal > 18.4 && imcTotal < 25){
            estado = 0
            println("Estado: Peso Regular")
            return estado
        }
        else if(imcTotal > 24.9){
            println("Estado: Sobrepeso")
            estado = 1
            return estado
        }
        else{
            println("Estado: Datos Insuficientes")
        }
        return 0
    }
    fun esMayorDeEdad(p : Persona) : Boolean{
        if(p.getEdad() > 17){
            println("Mayor de Edad")
            return true
        }
        else{
            println("Menor de Edad")
            return false
        }
    }
    fun comprobarSexo(p : Persona) : Boolean{
        if(p.getSexo() == "H" || p.getSexo() == "M"){
            return true
        }
        else{
            setSexo("H")
            return false
        }
    }
    fun toString(p : Persona) : Unit {
        println("Nombre: " + p.getNombre())
        println("Edad: " + p.getEdad())
        println("Cedula: " + p.getCedula())
        println("Sexo: " + p.getSexo())
        println("Peso: " + p.getPeso())
        println("Altura: " + p.getAltura())
    }
}