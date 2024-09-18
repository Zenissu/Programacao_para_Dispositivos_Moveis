import java.util.Arrays;

public class Exercicio_2 {
    static void maiorOuMenor() {
        //02 - Escreva um programa que leia cinco números e exiba o maior deles.
        int[] num = {1, 5, 3, 2, 4};
        int maior = 0;
        for (int i = 0; i < num.length; i++) {

            if (maior < num[i]) {
                maior = num[i];
            }
        }
        System.out.println("Números na comparação:" + Arrays.toString(num));
        System.out.println("O maior número é o: " + maior);
    }
}
