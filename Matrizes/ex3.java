package Matrizes;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declarei os valores que eu quero
        int a = 5;
        int b = 4;
        
        int product = a * b; // vai multiplicar os valores
        System.out.println("Digite o comprimento do lado do quadrado: ");
        int l = scanner.nextInt();

        System.out.println("O perímetro do quadrado é: " + product);
            
    }
}
        