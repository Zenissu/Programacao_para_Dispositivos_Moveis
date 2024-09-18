import java.util.Scanner;

public class Exercicio_8 {
    static Scanner scanner = new Scanner(System.in);
    public static void vogais() {
        // 08 - Escreva um programa que conte o número de vogais em uma string.

        String palavra;
        char letra; //Para facilitar a comparação
        int vogais = 0;

        System.out.println("Escreva uma palavra:");
        palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length(); i++) {
            //Transformas as letras de maiúscula para minúscula antes de fazer a contagem
            letra = Character.toLowerCase(palavra.charAt(i));
            if (Character.isLetter(letra)) {
                if (palavra.charAt(i) != ' ') {
                    if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                        vogais += 1;
                    }
                }
            }
        }
        System.out.println("Total de vogais: " + vogais);
    }
}
