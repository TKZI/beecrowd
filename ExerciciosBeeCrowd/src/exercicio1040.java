import java.util.Locale;
import java.util.Scanner;

public class exercicio1040 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double n1, n2, n3, n4, media;

        n1 = entrada.nextDouble() * 2;
        n2 = entrada.nextDouble() * 3;
        n3 = entrada.nextDouble() * 4;
        n4 = entrada.nextDouble();

        media = (n1 + n2 + n3 + n4) / 10;
        if (media >= 7.0) {
            System.out.println(String.format("Media: %.1f", media));
            System.out.println("Aluno aprovado.");
        } else if (media < 7.0 && media >= 5.0) {
            System.out.println(String.format("Media: %.1f", media));
            System.out.println("Aluno em exame.");
            double exame = entrada.nextDouble();
            System.out.println("Nota do exame: " + exame);
            media = (media + exame) / 2;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println(String.format("Media final: %.1f", media));
            } else {
                System.out.println(String.format("Media final: %.1f", media));
                System.out.println("Aluno reprovado.");
            }
        } else {
            // precisa tirar 0.0001 pois o java arredonda o 4.85
            System.out.println(String.format("Media: %.1f", media - 0.0001));
            System.out.println("Aluno reprovado.");
        }

        entrada.close();

    }

}
