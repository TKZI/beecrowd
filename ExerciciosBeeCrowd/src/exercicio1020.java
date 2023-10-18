import java.util.Scanner;

public class exercicio1020 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer totalDeDias = entrada.nextInt();

        Integer ano = totalDeDias / 365;
        Integer mes = (totalDeDias % 365) / 30;
        Integer dias = (totalDeDias % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");

        entrada.close();
    }

}
