import java.util.Scanner;

public class exercicio1008 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer ID = entrada.nextInt();
        Integer HOUR = entrada.nextInt();
        Double ValorPorHora = entrada.nextDouble();

        Double ValorFinalMes = HOUR * ValorPorHora;

        System.out.println("NUMBER = " + ID);
        System.out.printf("SALARY = U$ %.2f%n", ValorFinalMes);

        entrada.close();

    }

}
