public class Exercicio_15 {
    public static void pares() {
        System.out.println("15 - Escreva um programa que exiba todos os números pares de um limite inicial e um limite final que devem ser informados pelo usuário.");
        int inicio, fim;

        System.out.println("Escreva o numero inicial: ");
        inicio = (int) Verificador.numero();

        System.out.println("Escreva o numero final: ");
        fim = (int) Verificador.numero();

        System.out.println("**** Números pares de " + inicio + " até " + fim + " ****");

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
