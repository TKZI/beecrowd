import java.util.Scanner;

public class exercicio1003 {

    public static void main(String[] args) {

        int A, B, SOMA;
        Scanner entrada = new Scanner(System.in);

        A = entrada.nextInt();
        B = entrada.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
        entrada.close();
    }

}
