package week9.wed;

import week8.thu.Solution;

import java.util.Arrays;

public class QuickSortArray {

    public int[] solution(int[] arr) {
        int leftidx = 0;
        int rightidx = arr.length;
        int pivot = arr[arr.length / 2];

        while(arr[leftidx] < pivot) {
            leftidx++;
            System.out.println(arr[leftidx]);
        }



        return arr;
    }
    public static void main(String[] args) {
        QuickSortArray QA = new QuickSortArray();
        int[] arr = {20,18,5,19,40,50,5,25};
        QA.solution(arr);
    }
}
