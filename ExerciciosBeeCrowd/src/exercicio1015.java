import java.util.Scanner;

public class exercicio1015 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double x1 = entrada.nextDouble();
        Double y1 = entrada.nextDouble();
        Double x2 = entrada.nextDouble();
        Double y2 = entrada.nextDouble();

        Double distancia = (Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2));
        Double calculo = Math.sqrt(distancia);

        System.out.printf("%.4f%n", calculo);

        entrada.close();

    }

}
