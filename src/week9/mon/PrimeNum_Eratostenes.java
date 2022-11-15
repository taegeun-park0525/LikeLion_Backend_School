package week9.mon;

import java.util.Arrays;

public class PrimeNum_Eratostenes {
    public int[] Eratos(int[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
            } else if (arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        PrimeNum_Eratostenes primeNum_eratostenes = new PrimeNum_Eratostenes();

        int[] arr = new int[50-1];
        for (int i = 2; i <= 50; i++) {
            arr[i - 2] = i;
        }

        primeNum_eratostenes.Eratos(arr);

        System.out.println(Arrays.toString(arr));
    }
}
