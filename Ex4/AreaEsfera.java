package Ex4;

import java.util.Scanner;

public class AreaEsfera {
     public static void main(String[] args) {

        double pi = 3.14;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a área da superfície da esfera: ");
        double area = scan.nextDouble();

        double raio = Math.sqrt(area / (4 * pi));
        System.out.printf("O raio da esfera é: %.2f cm", raio); 

        scan.close();
    }
}
