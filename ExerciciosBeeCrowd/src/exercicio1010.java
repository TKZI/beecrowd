import java.util.Scanner;

public class exercicio1010 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer CodProduto = entrada.nextInt();
        Integer QuantidadeProd1 = entrada.nextInt();
        Double ValorProduto1 = entrada.nextDouble();
        Integer CodProduto2 = entrada.nextInt();
        Integer QuantidadeProd2 = entrada.nextInt();
        Double valorProduto2 = entrada.nextDouble();

        Double valorAPagar = (QuantidadeProd1 * ValorProduto1) + (QuantidadeProd2 * valorProduto2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);

    }
}
