import java.util.Scanner;

public class exercicio1019 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer segundos = entrada.nextInt();

        Integer horas = segundos / 3600;
        Integer guardaMod = segundos % 3600;
        Integer minutos = guardaMod / 60;
        Integer segundosPrint = guardaMod % 60;

        System.out.println(String.format("%d:%d:%d", horas, minutos, segundosPrint));

        entrada.close();
    }

}
