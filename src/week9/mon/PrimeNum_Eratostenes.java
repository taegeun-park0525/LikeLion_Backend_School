package week9.mon;

public class PrimeNum_Eratostenes {
    public int[] Eratos(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
        }
    }

    public static void main(String[] args) {
        PrimeNum_Eratostenes primeNum_eratostenes = new PrimeNum_Eratostenes();
        int[] arr = new int[50];
        for (int i = 2; i <= 50; i++) {
            arr[i-2]= i;
        }

        primeNum_eratostenes.Eratos(arr);
    }
}
