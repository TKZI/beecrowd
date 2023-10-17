import java.util.Scanner;

public class exercicio1018 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor = entrada.nextInt();
        int vetor[] = { 100, 50, 20, 10, 5, 2, 1 };

        System.out.println(valor);
        for (int percorrer = 0; percorrer < vetor.length; percorrer++) {
            int percorrer2 = vetor[percorrer];
            int calcula = valor / percorrer2;
            valor %= percorrer2;

            System.out.printf("%d nota(s) de R$ %d,00 %n", calcula, percorrer2);

        }
        entrada.close();

    }
}
