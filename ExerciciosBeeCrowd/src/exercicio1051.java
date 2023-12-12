import java.util.Scanner;

public class exercicio1051 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double lisarb = entrada.nextDouble();
        Double taxes;

        if (lisarb <= 2000.00) {
            System.out.println("Isento");
        } else if (lisarb >= 2000.01 && lisarb <= 3000.00) {
            taxes = (lisarb - 2000.00) * 0.08;
            System.out.println(String.format("R$ %.2f", taxes));

        } else if (lisarb >= 3000.01 && lisarb <= 4500.00) {
            taxes = (lisarb - 3000.00) * 0.18;
            Double incremento = 1000 * 0.08;
            taxes += incremento;
            System.out.println(String.format("R$ %.2f", taxes));

        } else if (lisarb >= 4500.00) {
            taxes = (lisarb - 4500) * 0.28;
            Double incremento = 1500 * 0.18;
            Double incremento2 = 1000 * 0.08;
            taxes += incremento;
            taxes += incremento2;

            System.out.println(String.format("R$ %.2f", taxes));

        }

        entrada.close();
    }

}
