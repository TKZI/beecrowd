import java.util.Scanner;

public class exercicio1048 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Double salarioAtual = entrada.nextDouble();

        Double percentualDeGanho;

        if (salarioAtual <= 400.00) {
            percentualDeGanho = 0.15;
        } else if (salarioAtual <= 800.00) {
            percentualDeGanho = 0.12;

        } else if (salarioAtual <= 1200.00) {
            percentualDeGanho = 0.10;
        } else if (salarioAtual <= 2000.00) {
            percentualDeGanho = 0.07;
        } else {
            percentualDeGanho = 0.04;
        }

        System.out.println(String.format("Novo salario: %.2f", salarioAtual + (salarioAtual * percentualDeGanho)));
        System.out.println(String.format("Reajuste ganho: %.2f", salarioAtual * percentualDeGanho));
        System.out.println(String.format("Em percentual: %.0f %%", percentualDeGanho * 100));

        entrada.close();

    }

}
