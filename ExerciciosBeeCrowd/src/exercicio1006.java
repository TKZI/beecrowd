import java.util.Scanner;

public class exercicio1006 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double A, B, C;
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        Double mediaFinal = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA =%.1f", mediaFinal);
        entrada.close();

    }

}
