import java.util.Scanner;

public class exercicio1045 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Double a, b, c;
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();
        Double guardaValor;
        if (a < b) {
            guardaValor = a;
            a = b;
            b = guardaValor;
        }
        if (b < c) {
            guardaValor = b;
            b = c;
            c = guardaValor;
        }
        if (a < b) {
            guardaValor = a;
            a = b;
            b = guardaValor;
        }

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (Math.abs(a - b) < 1e-9 && Math.abs(a - c) < 1e-9) { // Math.abs para retornar o valor absoluto e não dar
                System.out.println("TRIANGULO EQUILATERO"); // false pelo flutuante 1e-9 para comparação
            }
            if ((Math.abs(a - b) < 1e-9 && Math.abs(a - c) >= 1e-9) ||
                    (Math.abs(a - c) < 1e-9 && Math.abs(a - b) >= 1e-9) ||
                    (Math.abs(b - c) < 1e-9 && Math.abs(b - a) >= 1e-9)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        entrada.close();
    }

}
