import java.util.Scanner;

public class Exercicio_5 {
    static Scanner scanner = new Scanner(System.in);
    static void fatorial() {
        // 05 - Escreva um programa que calcule o fatorial de um número.
        int num = 0;
        boolean verifica = false;
        int fatorial = 1;
        int cont = 0;
        while (!verifica) {
            System.out.print("Digite um número: ");
            // Verifica se a entrada é um número inteiro
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                verifica = true; // Sai do loop se a entrada for válida
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
        System.out.println("Fatorial do número : " + num);

        if (num < 0) {
            System.out.println("Fatorial apenas para números positivos.");
        } else {
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
        }
        System.out.println("Valor fatorial final: " + fatorial);
    }
}
