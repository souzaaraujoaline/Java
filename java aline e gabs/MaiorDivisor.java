public class MaiorDivisor {
    public static void main(String[]args){
        //Declarei os valores que eu quero
        int numero = 13;
        int maiorDivisor = 1;

        for (int i = 2; i<=numero; i++){
            if (numero % i == 0){
                maiorDivisor = i;
            }
        }
        System.out.println("O maior divisor é:" + maiorDivisor);
    }
}
