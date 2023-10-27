import java.util.Scanner;

public class exercicio1042 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3;
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();

        int valorEntrada1 = n1;
        int valorEntrada2 = n2;
        int valorEntrada3 = n3;

        int guardaValor;

        if (n1 > n2) {
            guardaValor = n2;
            n2 = n1;
            n1 = guardaValor;
        }
        if (n2 > n3) {
            guardaValor = n3;
            n3 = n2;
            n2 = guardaValor;
        }

        if (n1 > n2) {
            guardaValor = n2;
            n2 = n1;
            n1 = guardaValor;
        }

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println();
        System.out.println(valorEntrada1);
        System.out.println(valorEntrada2);
        System.out.println(valorEntrada3);

        entrada.close();
    }
}
