package Modulo1;

import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {
        int[] lista = {5, 2, 8, 1, 9, 3};

        System.out.println("Lista original: " + Arrays.toString(lista));

        bubbleSort(lista);

        System.out.println("Lista ordenada: " + Arrays.toString(lista));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean troca;

        for (int i = 0; i < n - 1; i++) {
            troca = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    troca = true;
                }
            }

            if (!troca) {
              
                break;
            }
        }
    }
}
