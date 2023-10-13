import java.util.Scanner;

public class exercicio1013 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer A, B, ABS;
        A = entrada.nextInt();
        B = entrada.nextInt();
        ABS = entrada.nextInt();

        Integer maior = Math.max(Math.max(A, B), ABS);

        System.out.println(maior + " eh o maior");
        entrada.close();
    }

}
