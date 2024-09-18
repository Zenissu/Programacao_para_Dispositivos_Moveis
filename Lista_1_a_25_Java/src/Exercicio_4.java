import java.util.Scanner;

public class Exercicio_4 {
    static Scanner scanner = new Scanner(System.in);

    static void tabuada() {
        // 04 - Escreva um programa que exiba a tabuada de um número fornecido pelo usuário.
        float num = 0;
        boolean verifica = false;
        while (!verifica) {
            System.out.print("Digite um número: ");
            // Verifica se a entrada é um número inteiro
            if (scanner.hasNextFloat()) {
                num = scanner.nextFloat();
                // Sai do loop se a entrada for válida
                verifica = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        System.out.println("Tabuada do número: " + num + " até x100!");

        for (int i = 0; i <= 100; i++) {
            System.out.println(num + " x " + i + " = " + (i * num));
        }
    }
}
