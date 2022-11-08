package week8.tue;

import java.util.Scanner;

public class DataSearch {
    public static void main(String[] args) {
        int result = -1;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                result = i+1;
                break;
            }
        }
        System.out.println(result);
    }
}
