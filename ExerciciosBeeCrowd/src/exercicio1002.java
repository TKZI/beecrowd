import java.util.Scanner;

public class exercicio1002 {

    public static void main(String[] args) {

        final double n = 3.14159;
        Scanner entrada = new Scanner(System.in);
        double R = entrada.nextDouble();

        double A = n * Math.pow(R, 2);

        System.out.printf("A=%.4f%n", A);
        entrada.close();
    }

}
