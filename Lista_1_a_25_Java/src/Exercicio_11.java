
public class Exercicio_11 {

    static void media() {
        // 11 - Escreva um programa que calcule a média de uma lista de 10 números.
        float[] numeros = {4, 7, 10, 7, 11, 3, 15, 6, 12, 10};
        float soma = 0;
        float media = 0;
        int totaln = numeros.length;
        for (int i = 0; i < totaln; i++) {
            soma += numeros[i];
        }
        media = soma / totaln;
        System.out.println("A média e igual a : " + media);
    }
}