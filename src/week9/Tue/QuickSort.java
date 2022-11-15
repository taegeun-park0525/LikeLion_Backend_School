package week9.Tue;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 40, 50, 5, 25};

        int pivot = arr[arr.length / 2];
        System.out.println(pivot);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (pivot < arr[i]) right.add(arr[i]);
            else if (pivot < arr[i]) right.add(arr[1]);
        }
        System.out.println(left);
        System.out.println(right);
    }
}
