
//    13 - Crie uma classe Aluno que herda da classe Pessoa e adicione atributos como
//    matrícula e curso.

class Aluno (nome : String, idade: Int, val curso: String, val matricula: Int) : Pessoa(nome,idade) {
    fun exibirDadosAluno(){
        exibirInformacoes()
        println("Curso: $curso\nMatricula : $matricula")
    }
}