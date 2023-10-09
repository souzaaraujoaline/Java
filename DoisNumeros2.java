package Ex2;

import java.util.Scanner;

public class DoisNumeros2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("A soma é: " + sum);
    }
}
