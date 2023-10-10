package Ex3;

public class VolumePirâmide {
    public static void main(String[] args) {
        //declarei os valores da variável
        int a = 36; //6 * 6
        int b = 8;
        int c = 288;
        int d = 3;
        //a = base * altura / 3
        int product = a * b;
        System.out.println("Base * altura = " + product);

        int quotient = c / d;
        System.out.println("O volume da pirâmide é " + quotient);
    }
}
