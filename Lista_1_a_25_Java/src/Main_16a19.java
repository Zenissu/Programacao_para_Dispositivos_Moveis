import java.util.Scanner;

public class Main_16a19 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//******************************************************************Exercício 16,17,18 na Classe Pessoa*********************************************************************************************************
        // 19 - Crie uma classe main que instancie um objeto da classe Pessoa, um objeto da classe Aluno e um objeto da classe Funcionário.
        Pessoa a = new Pessoa("Joãozin Mascarenha", 18);
        a.mostraDados();
        Aluno b = new Aluno("Maria Jozefina", 22, "2321231", "Enfermagem");
        b.mostraDados();
        Funcionario c = new Funcionario("Seu Antonio", 66, 6800, "Segurança");
        c.mostraDados();
    }
}







