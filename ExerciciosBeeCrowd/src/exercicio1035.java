import java.util.Scanner;

public class exercicio1035 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer A, B, C, D;

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();

        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");

        }

        entrada.close();
    }

}
