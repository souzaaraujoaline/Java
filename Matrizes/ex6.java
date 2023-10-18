package Matrizes;
import java.util.Scanner; 

public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 5;
        System.out.println("Digite o primeiro numero: ");
        int a2 = scanner.nextInt();
        int fatorial = calcularFatorial(numero);
        System.out.println("Fatorial de " + numero + " é " + fatorial);
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }
}