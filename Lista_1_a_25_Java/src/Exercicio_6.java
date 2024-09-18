public class Exercicio_6 {
    public static void primoOuNao() {
        // 06 - Escreva um programa que verifique se um número é primo.
        int[] num = new int[101];

        for (int i = 2; i <= 100; i++) {
            num[i] = i;
        }

        for (int j : num) {
            if (j == 2 || j == 3 || j == 5 || j==7) {
                System.out.println("O número " + j + " é primo");
                continue;
            }
            //Deve se eliminar todos os multiplos de 2, 3 e 5 para garantir que os outros são primos
            if (j % 2 != 0) {
                if (j % 3 != 0) {
                    if (j % 5 != 0) {
                        if (j % 7 != 0){System.out.println("O número " + j + " é primo");}
                    }
                }
            }
        }
    }
}
