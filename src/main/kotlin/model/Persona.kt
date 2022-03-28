package model

open class Persona {
    private var nombre : String
    private var edad : Int
    private var cedula : Int
    private var sexo : String
    private var peso : Float
    private var altura : Float

    constructor(){
        nombre = ""
        edad = 0
        cedula = 0
        sexo = ""
        peso = 0.0f
        altura = 0.0f
    }
    constructor(nombre : String, edad : Int, sexo : String){
        this.nombre = nombre
        this.edad = edad
        cedula = 0
        this.sexo = sexo
        peso = 0.0f
        altura = 0.0f
    }
    constructor(nombre : String, edad : Int, cedula : Int, sexo : String, peso : Float, altura : Float){
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }
    fun getNombre(): String {
        return this.nombre
    }
    fun setNombre(nombre: String){
        this.nombre = nombre
    }
    fun getEdad(): Int {
        return this.edad
    }
    fun setEdad(edad: Int){
        this.edad = edad
    }
    fun getCedula(): Int {
        return this.cedula
    }
    fun setCedula(cedula: Int){
        this.cedula = cedula
    }
    fun getSexo(): String {
        return this.sexo
    }
    fun setSexo(sexo: String){
        this.sexo = sexo
    }
    fun getPeso(): Float {
        return this.peso
    }
    fun setPeso(peso: Float){
        this.peso = peso
    }
    fun getAltura(): Float {
        return this.altura
    }
    fun setAltura(altura: Float){
        this.altura = altura
    }
}