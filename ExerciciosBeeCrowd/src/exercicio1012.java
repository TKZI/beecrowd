import java.util.Scanner;

public class exercicio1012 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final Double PI = 3.14159;

        Double A, B, C;
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        Double triangulo = A * C / 2;
        Double circulo = PI * Math.pow(C, 2);
        Double trapezio = (A + B) * C / 2;
        Double quadrado = Math.pow(B, 2);
        Double retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
        entrada.close();

    }

}
