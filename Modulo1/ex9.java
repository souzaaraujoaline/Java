package Modulo1;

import java.util.Scanner;

public class ex9 {
   
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            //Declarei os valores que eu quero
    
            System.out.println("Digite o primeiro numero: ");
            int a2 = scanner.nextInt();
    
            for (int i = 2; i <= a2/2; i++) { //aqui é a declaração de um número primo
                if (a2 % i == 0) {
                    System.out.println("O número não é primo"); //se for divisível por mais de 2 números não é primo
                    return;
                }
            }
    
            if (a2 > 1) {
                System.out.println("O número é primo");
            } else {
                System.out.println("O número não é primo");
            }
        }
}
