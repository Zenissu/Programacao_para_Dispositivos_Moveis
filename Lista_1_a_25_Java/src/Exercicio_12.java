public class Exercicio_12 {
    // 12 - Escreva um programa que exiba os primeiros N termos da sequência de Fibonacci.
    public static int Fibonacci(int n){
        if(n <= 1)return n;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    public static void printFibo(int n){
        for(int i = 0; i< n; i++){
            System.out.print(Fibonacci(i) + " ");
        }
        System.out.println();
    }
}
