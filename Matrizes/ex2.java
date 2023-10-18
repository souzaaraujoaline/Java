package Matrizes;
import java.util.Scanner;

public class ex2 {

    public static int soma(int a, int b, int c ,int d) { // executando a função
        return a*d - b*c; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor de uma matriz 2x2: "); // pedindo o primeiro valor
        int a = scan.nextInt();

        System.out.println("Digite o o segundo valor da matriz : "); // pedindo o segundo valor valor
        int b = scan.nextInt();

        System.out.println("Digite o terceiro valor da matriz: "); // pedindo o terceiro valor
        int c = scan.nextInt();

        System.out.println("Digite o quarto valor da matriz: "); // pedindo o quarto valor
        int d = scan.nextInt();

        int resultado = soma(a, b, c, d);
        System.out.println("Resultado: " + resultado); // printando o resultado

        scan.close();
    }
}
