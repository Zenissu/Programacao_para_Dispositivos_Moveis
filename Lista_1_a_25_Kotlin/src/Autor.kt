
//    18 - Crie uma classe Autor que deve ter nome, cpf.

open class Autor (private val Nome : String,private val Cpf: Int){
    fun print(){
        println("Autor(Nome: $Nome, Cpf: $Cpf)")
    }
    fun getNome(): String{
        return Nome
    }
}