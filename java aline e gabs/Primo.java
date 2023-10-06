public class Primo {
    public static void main(String[] args) {
        //Declarei os valores que eu quero
        int numero = 13;

        System.out.println("O número escolhido é 13"); // vai printar essa mensagem na tela

        for (int i = 2; i <= numero/2; i++) { //aqui é a declaração de um número primo
            if (numero % i == 0) {
                System.out.println("O número não é primo"); //se for divisível por mais de 2 números não é primo
                return;
            }
        }

        if (numero > 1) {
            System.out.println("O número é primo");
        } else {
            System.out.println("O número não é primo");
        }
    }
}
