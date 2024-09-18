import java.util.Scanner;

public class Exercicio_14 {

    static Scanner scanner = new Scanner(System.in);

    public static void calculadora() {
        // 14 - Escreva um programa que implemente uma calculadora simples com as operações de adição, subtração, multiplicação e divisão.
        double n;
        double n2;
        double total;
        String operador;

        System.out.println("Escreva o primeiro valor:");
        n = Verificador.numero();

        System.out.println("Qual o operador\n |+| |-|  |/|  |*|  ?");
        operador = Verificador.operador((scanner.nextLine()));

        switch (operador.strip()) {
            case "+" -> {
                System.out.println("Digite o segundo valor:");
                n2 = Verificador.numero();
                total = n + n2;
                System.out.println(n + " + " + n2 + " = " + total);
            }
            case "-" -> {
                System.out.println("Digite o segundo valor:");
                n2 = Verificador.numero();
                total = n - n2;
                System.out.println(n + " - " + n2 + " = " + total);
            }
            case "*" -> {
                System.out.println("Digite o segundo valor:");
                n2 = Verificador.numero();
                total = n * n2;
                System.out.println(n + " * " + n2 + " = " + total);
            }
            case "/" -> {
                System.out.println("Digite o segundo valor:");
                n2 = Verificador.numero();
                total = n / n2;
                System.out.println(n + " / " + n2 + " = " + total);
            }
            default -> {
                System.out.println("Digite um operador valido");
            }
        }
    }
}
