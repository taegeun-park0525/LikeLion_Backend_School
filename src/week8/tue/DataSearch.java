package week8.tue;

import java.util.Scanner;

public class DataSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int num = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                System.out.println(i+1);
            }
        }
    }
}
