import java.util.Scanner;

public class Main_22_a_25 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//******************************************************************Exercício 22,23,24 na Classe Autor*****************************************************************************************
// 25 - Crie uma classe Main que deve instanciar 3 Autores, 3 Editoras e 3 Livros e exibi-los.

        Autor autor1 = new Autor("Machado de Assis", 233133213);
        Autor autor2 = new Autor("Clarice Lispector", 4123123);
        Autor autor3 = new Autor("Jorge Amado", 421331123);

        //Criando três editoras
        Editora editora1 = new Editora("Companhia das Letras", "São Paulo, Brasil", 312313132);
        Editora editora2 = new Editora("Editora Record", "Rio de Janeiro, Brasil", 312313131);
        Editora editora3 = new Editora("Editora Saraiva", "São Paulo, Brasil", 412313132);

        // Criando três livros
        Livro livro1 = new Livro("Dom Casmurro", 1899, autor1, editora1);
        Livro livro2 = new Livro("A Hora da Estrela", 1977, autor2, editora2);
        Livro livro3 = new Livro("Capitães da Areia", 1937, autor3, editora3);

        // Exibindo os dados dos livros
        livro1.exibirDados();
        livro2.exibirDados();
        livro3.exibirDados();
    }
}







