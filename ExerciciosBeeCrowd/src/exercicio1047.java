import java.util.Scanner;

public class exercicio1047 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Integer horaInicial, minutoInicial, horaFinal, minutoFinal, horasDeJogo, minutosDeJogo;
        horaInicial = entrada.nextInt();
        minutoInicial = entrada.nextInt();
        horaFinal = entrada.nextInt();
        minutoFinal = entrada.nextInt();

        if (horaInicial < horaFinal) {
            horasDeJogo = horaFinal - horaInicial;
            if (minutoInicial < minutoFinal) {
                minutosDeJogo = minutoFinal - minutoInicial;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);
            } else if (minutoInicial > minutoFinal) {
                horasDeJogo--;
                minutosDeJogo = 60 - (minutoInicial - minutoFinal);
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);
            }

        } else if (horaInicial > horaFinal) {
            horasDeJogo = 24 - horaInicial + horaFinal;
            if (minutoInicial < minutoFinal) {
                minutosDeJogo = minutoFinal - minutoInicial;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);

            } else if (minutoInicial > minutoFinal) {
                horasDeJogo--;
                minutosDeJogo = 60 - (minutoInicial - minutoFinal);
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);
            }
        } else if (horaInicial == horaFinal && minutoInicial > minutoFinal) {
            horasDeJogo = 24;
            if (minutoInicial < minutoFinal) {
                minutosDeJogo = minutoFinal - minutoInicial;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);

            } else if (minutoInicial > minutoFinal) {
                horasDeJogo--;
                minutosDeJogo = 60 - (minutoInicial - minutoFinal);
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);
            } else {
                minutosDeJogo = 0;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);
            }
        } else if (horaInicial == horaFinal && minutoInicial < minutoFinal) {
            horasDeJogo = horaInicial - horaFinal;
            if (minutoInicial < minutoFinal) {
                minutosDeJogo = minutoFinal - minutoInicial;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);

            } else if (minutoInicial > minutoFinal) {
                horasDeJogo--;
                minutosDeJogo = 60 - (minutoInicial - minutoFinal);
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);
            }
        } else {
            horasDeJogo = 24;
            minutosDeJogo = 0;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horasDeJogo, minutosDeJogo);
        }

        entrada.close();

    }
}
