package Modulo1;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {

        int[] array = {4, 7, 2, 1};
        trocaPosicoes(array, 0, 1);
        trocaPosicoes(array, 2, 3);
        
        System.out.println("Array após troca: " + Arrays.toString(array));
    }

    public static void trocaPosicoes(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
