package Matrizes;

import java.util.Scanner;

public class ex5 {
   
    public static boolean eDivisivelPor4(int numero) {
        return numero % 4 == 0;
    }

    public static boolean eDivisivelPor7(int numero) {
        return numero % 7 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (eDivisivelPor4(numero) && eDivisivelPor7(numero)) {
            System.out.println("O número é divisível por 4 e 7.");
        } else {
            System.out.println("O número não é divisível por 4 e 7.");
        }
    }
}
