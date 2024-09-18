import java.util.Scanner;

public class Exercicio_13 {
    // 13 - Escreva um programa que converta temperaturas entre Celsius e Fahrenheit.
    static Scanner scanner = new Scanner(System.in);

    public static void conversor(){

        System.out.println("Conversor de temperatura\nDigite 0 para Fahrenheit e 1 para Celsius: ");
        int resposta = scanner.nextInt();

        System.out.println("\nEscreva a temperatura a ser convertida:");
        double temp = Verificador.numero();
        if(resposta==0){
            double fahrenheit = fahrenheit(temp);
            System.out.println("Fahrenheit: " + fahrenheit);
        }else if(resposta==1){
            double celsius = celsius(temp);
            System.out.println("Celsius: " + celsius);
        }else{
            System.out.println("Escreva um número valido");
        }
        }
    public static double fahrenheit(double t){
        double fahrenheit = (t * 1.8)+32;
        return fahrenheit;
    }
    public static double celsius(double t){
        double celsius = (t - 32 )/1.8;
        return celsius;
    }
}
