import java.util.Scanner;

public class exercicio1023 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double A, B, C;
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        Double D = Math.pow(B, 2) - 4 * A * C;

        if (D > 0 && A != 0) {
            Double raiz1 = (-B + Math.sqrt(D)) / (2 * A);
            Double raiz2 = (-B - Math.sqrt(D)) / (2 * A);

            System.out.println(String.format("R1 = %.5f", raiz1));
            System.out.println(String.format("R2 = %.5f", raiz2));
        } else {
            System.out.println("Impossivel calcular");
        }
        entrada.close();

    }

}
