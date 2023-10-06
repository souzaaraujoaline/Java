public class MenorDvisor {
    public static void main(String[]args){
        //Declarei os valores que eu quero
        int numero = 13;
        int menorDivisor = 1;

        for (int i = 2; i>=numero; i++){ // fazendo um for definindo o i como 2
            if (numero % i == 0){ // caso o resto da numero da variavel i for diferente que 0 o menor divisor é igual a este numero
                menorDivisor = i; 
            }
        }
        System.out.println("O menor divisor é:" + menorDivisor);
    }
}
