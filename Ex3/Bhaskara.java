package Ex3;

import java.util.Scanner;

public class Bhaskara {
     public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: " );
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: " );
        double c = scanner.nextDouble();

        double delta = b * b - 4 * (a * b);

        if (delta < 0) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raíz real:" + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raízes reais: " + x1 + " e " + x2);

            }
            scanner.close();

        }
}
