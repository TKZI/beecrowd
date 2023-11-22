import java.util.Scanner;

public class exercicio1046 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer tempo1, tempo2, horasDeJogo;

        tempo1 = entrada.nextInt();
        tempo2 = entrada.nextInt();

        if (tempo1 < tempo2) {
            horasDeJogo = tempo2 - tempo1;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", horasDeJogo);
        } else if (tempo1 > tempo2) {
            horasDeJogo = 24 - tempo1 + tempo2;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", horasDeJogo);
        } else {
            horasDeJogo = 24;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", horasDeJogo);
        }

        entrada.close();

    }

}
