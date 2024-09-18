import java.util.Scanner;

public class Exercicio_7 {
    static Scanner scanner = new Scanner(System.in);
    public static void inversao() {
        // 07 - Escreva um programa que inverta uma string fornecida pelo usuário
        String palavra ;
        String contrario = "";

        System.out.println("Escreva uma palavra:");
        palavra = scanner.nextLine();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            contrario += palavra.charAt(i);
        }
        System.out.println(contrario);
    }
}
