package Modulo1;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int a = 5;
    int b = 3;

    System.out.println("Digite o primeiro numero: ");
    int a2 = scanner.nextInt();

    System.out.println("Digite o segundo número numero: ");
    int b2 = scanner.nextInt();

        int product = a * b;
        System.out.println("Resultado:  " + product );
}
}
