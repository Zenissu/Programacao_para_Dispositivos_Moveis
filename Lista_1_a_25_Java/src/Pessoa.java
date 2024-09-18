public class Pessoa {
    //16 - Crie uma classe Pessoa com atributos nome, idade e métodos para exibir as
    //informações da pessoa
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void mostraDados() {
        System.out.println("\n Nome: " + this.getNome() + "\n Idade: " + this.getIdade());
    }
}

class Aluno extends Pessoa {
    // 17 - Crie uma classe Aluno que herda da classe Pessoa e adicione atributos como matrícula e curso.
    String matricula;
    String curso;

    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("\n Matricula: " + this.getMatricula() + "\n Curso: " + this.getCurso());
    }
}

class Funcionario extends Pessoa {
    // 18 - Crie uma classe Funcionário que herda da classe Pessoa e adicione atributos como salário e cargo.
    int salario;
    String cargo;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, int idade , int salario, String cargo) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    public void mostraDados() {
        super.mostraDados();
        System.out.println("\n Cargo: " + this.getCargo() + "\n Salario: " + this.getSalario());
    }
}