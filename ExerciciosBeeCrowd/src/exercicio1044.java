import java.util.Scanner;

public class exercicio1044 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer A, B;
        A = entrada.nextInt();
        B = entrada.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        entrada.close();
    }

}
