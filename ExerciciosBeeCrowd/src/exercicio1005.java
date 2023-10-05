import java.util.Scanner;

public class exercicio1005 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double a, b, MEDIA;
        a = entrada.nextDouble();
        b = entrada.nextDouble();

        MEDIA = ((3.5 * a) + (7.5 * b)) / 11;
        ;

        System.out.printf(String.format("MEDIA = %.5f%n", MEDIA));
        entrada.close();
    }

}