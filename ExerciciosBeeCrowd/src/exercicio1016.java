import java.util.Scanner;

public class exercicio1016 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer x = entrada.nextInt();

        Integer distance = x * 2;

        System.out.println(distance + " minutos");

        entrada.close();
    }

}
