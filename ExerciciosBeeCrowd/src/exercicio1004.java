import java.util.Scanner;

public class exercicio1004 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer a = entrada.nextInt();
        Integer b = entrada.nextInt();

        Integer PROD = a * b;

        System.out.println("PROD = " + PROD);
        entrada.close();
    }

}
