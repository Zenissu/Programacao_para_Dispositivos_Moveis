import java.util.Scanner;

public class Verificador {
    static Scanner scanner = new Scanner(System.in);
    public static double numero(){
        boolean verifica = false;
        double n = 0;
        while (!verifica) {
            // Verifica se a entrada é um número
            if (scanner.hasNextFloat()) {
                n = scanner.nextFloat();
                verifica = true; // Sai do loop se a entrada for válida
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número valido.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
        return n;
    }
    public static String operador(String operador) {
        while (!operador.matches("[+\\-*/]")) {
            System.out.println("Operador inválido. Tente novamente:");
            operador = scanner.nextLine().strip();
        }
        return operador.strip();
    }
}
