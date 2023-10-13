import java.util.Scanner;

public class exercicio1014 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer km = entrada.nextInt();
        Double litro = entrada.nextDouble();

        Double media = km / litro;

        System.out.printf("%.3f km/l%n", media);

        entrada.close();
    }

}
