import java.util.Scanner;

public class exercicio1049 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String a, b, c;

        a = entrada.nextLine();
        b = entrada.nextLine();
        c = entrada.nextLine();

        if (a.equals("vertebrado")) {
            if (b.equals("ave")) {
                if (c.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else if (b.equals("mamifero")) {
                if (c.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else if (a.equals("invertebrado")) {
            if (b.equals("inseto")) {
                if (c.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else if (b.equals("anelideo")) {
                if (c.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        entrada.close();
    }

}
