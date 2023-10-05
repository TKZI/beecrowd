import java.util.Scanner;

public class exercicio1007 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer A, B, C, D;
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();
        Integer resultado = A * B - C * D;

        System.out.println("DIFERENCA = " + resultado);

        entrada.close();

    }
}
