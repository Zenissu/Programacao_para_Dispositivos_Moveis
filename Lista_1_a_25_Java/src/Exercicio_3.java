public class Exercicio_3 {
     public static void soma() {
        // 03 - Escreva um programa que calcule a soma dos números de 25 a 175.
        int num = 25;
        int soma = 0;
        for (int i = 0; i <= 149; i++) {

            soma += num;
            num += 1;

        }
        System.out.println("Total: " + soma);
    }
}
