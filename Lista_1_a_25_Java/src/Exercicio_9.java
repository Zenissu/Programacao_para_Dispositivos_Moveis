import java.util.Scanner;

public class Exercicio_9 {
    static Scanner scanner = new Scanner(System.in);
    public static void consoante() {
        // 09 - Escreva um programa que conte o número de consoantes em uma string.
        String palavra;
        char letra; //Para facilitar a comparação
        int consoantes = 0;

        System.out.println("Escreva uma palavra:");
        palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            //Transformas as letras de maiúscula para minúscula antes de fazer a contagem
            letra = Character.toLowerCase(palavra.charAt(i));
            if (Character.isLetter(letra)) {
                if (palavra.charAt(i) != ' ') {
                    if (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
                        consoantes += 1;
                    }
                }
            }
        }
        System.out.println("Total de consoantes: " + consoantes);
    }
}
