package Modulo1;
import java.util.Scanner;
public class ex5 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        
        String contrario = "";
        
        System.out.println("Digite uma palavra para verificar se é um palíndromo");
        String nome = scanner.nextLine();

        
        for (int i = (nome.length() -1); i >= 0; i--) {
            contrario = contrario + nome.charAt(i);
        }
        
        if (contrario.toLowerCase().equals(nome.toLowerCase())) {
            System.out.println("\n\n\t\tEssa palavra é palíndromo");
        } else {
            System.out.println("\n\n\t\tEssa palavra não é palíndromo");
        }
        
    }
}

