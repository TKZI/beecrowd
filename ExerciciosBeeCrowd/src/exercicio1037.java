import java.util.Scanner;

public class exercicio1037 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double numero = entrada.nextDouble();

        if (numero < 0 || numero > 100) {
            System.out.println("Fora de intervalo");
        } else if (numero >= 0 && numero <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else if (numero >= 25.00001 && numero <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        } else if (numero >= 50.00000001 && numero <= 75.0000000) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        entrada.close();

    }

}
