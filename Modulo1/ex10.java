package Modulo1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declarei os valores que eu quero
        double num2 = 8.0;
        double num3 = 6.5;
        double num5 = 14.50;
        double num1 = 2;
        
        System.out.println("Digite as notas separadas por espaço: ");
        int a2 = scanner.nextInt();

        double quotient = num5 / num1;
        System.out.println("A média das notas é " + quotient);

    }
}

