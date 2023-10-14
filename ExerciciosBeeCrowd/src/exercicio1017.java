import java.util.Scanner;

public class exercicio1017 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer hours = entrada.nextInt();
        Double km = entrada.nextDouble();

        Double litrosNecessarios = km / 12 * hours;

        System.out.println(String.format("%.3f%n", litrosNecessarios));

        entrada.close();
    }
}
