//*********************************************************************************************************Exercício 10*********************************************************************************************************
public class Exercicio_10 {
    // 10 - Ordene uma lista de números inteiros.
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void quickSort() {
        // Array de inteiros
        int[] array = {51, 491, 23, 2, 87, 3, 21, 8, 973, 4, 2, 8, 37, 4, 21, 80, 32, 198, 0, 37, 38, 213, 812, 8, 7, 94, 1274, 142, 10, 74, 2, 0, 1, 47, 12};
        int tamanho = array.length;

        System.out.println("Array original: ");
        printArray(array);

        qsort(array, 0, tamanho - 1);

        System.out.println("\nArray ordenado: ");
        printArray(array);
    }

    public static int particao(int[] array, int baixo, int alto) {
        int pivo = array[alto];
        int i = (baixo - 1);

        for (int j = baixo; j < alto; j++) {
            if (array[j] <= pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temporario = array[i + 1];
        array[i + 1] = array[alto];
        array[alto] = temporario;

        return i + 1;
    }

    public static void qsort(int[] array, int baixo, int alto) {
        if (baixo < alto) {
            int pivo = particao(array, baixo, alto);

            qsort(array, baixo, pivo - 1);
            qsort(array, pivo + 1, alto);
        }
    }
}