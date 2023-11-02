import java.util.Scanner;

public class exercicio1043 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double A, B, C;

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        if (B - C < A && A < B + C) {
            if (A - C < B && B < A + C) {
                if (A - B < C && C < A + B) {
                    System.out.println(String.format("Perimetro = %.1f", A + B + C));
                } else {
                    System.out.println(String.format("Area = %.1f", (A + B) * C / 2));
                }
            } else {
                System.out.println(String.format("Area = %.1f", (A + B) * C / 2));
            }
        } else {
            System.out.println(String.format("Area = %.1f", (A + B) * C / 2));
        }

        entrada.close();
    }

}
