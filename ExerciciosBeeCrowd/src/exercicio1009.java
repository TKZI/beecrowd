import java.util.Scanner;

public class exercicio1009 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nomeFuncionario = entrada.nextLine();
        Double salarioFuncionario = entrada.nextDouble();
        Double VendaFuncionario = entrada.nextDouble();

        Double salarioFinalMes = salarioFuncionario + (VendaFuncionario * 15 / 100);

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinalMes);

        entrada.close();
    }

}
