public class Exercicio_1 {
    public static void imparOuPar() {
        // 01 - Escreva um programa que determine se um número é par ou ímpar.
        int[] num = {1, 2, 3, 4, 5};

        for (int j : num) {
            if (j % 2 != 0) {
                System.out.println("Esse número e ímpar: " + j + "!");
            } else {
                System.out.println("Esse número e par: " + j + "!");
            }
        }
    }
}
