import java.util.Scanner;

public class exercicio1038 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double cachorroQuente = 4.0;
        Double xSalada = 4.5;
        Double xBacon = 5.0;
        Double torradaSimples = 2.0;
        Double refrigerante = 1.50;
        Integer codProduto = entrada.nextInt();
        Integer quantidade = entrada.nextInt();

        switch (codProduto) {
            case 1:
                System.out.println(String.format("Total: R$ %.2f", cachorroQuente * quantidade));
                break;
            case 2:
                System.out.println(String.format("Total: R$ %.2f", xSalada * quantidade));
                break;
            case 3:
                System.out.println(String.format("Total: R$ %.2f", xBacon * quantidade));
                break;
            case 4:
                System.out.println(String.format("Total: R$ %.2f", torradaSimples * quantidade));
                break;
            case 5:
                System.out.println(String.format("Total: R$ %.2f", refrigerante * quantidade));
                break;
        }
        entrada.close();
    }
}
