import java.util.Scanner;

public class exercicio1011 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final Double PI = 3.14159;
        Integer R = entrada.nextInt();
        Double volume = (4 / 3.0) * PI * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        entrada.close();

    }

}
