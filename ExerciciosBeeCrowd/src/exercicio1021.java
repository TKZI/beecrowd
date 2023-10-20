import java.util.Locale;
import java.util.Scanner;

public class exercicio1021 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);

        
        double valorReais = entrada.nextDouble();
        int valorCentavos = (int) (valorReais * 100);

        int notas[] = { 10000, 5000, 2000, 1000, 500, 200 }; 
        int moedas[] = { 100, 50, 25, 10, 5, 1 }; 

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNota = valorCentavos / nota;
            valorCentavos %= nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNota, nota / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidadeMoeda = valorCentavos / moeda;
            valorCentavos %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoeda, moeda / 100.0);
        }

        entrada.close();
    }
    }

}
