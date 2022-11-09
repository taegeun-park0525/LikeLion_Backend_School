package week8.wed;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,7,4,9,10,223,111,23,3,39};

        int idx =0 ;
        int min = 0;
        for (int j = idx; j < arr.length; j++) {
            if (arr[idx] < arr[j]) {
                min = arr[idx];
            } else {
                min = arr[j];
            }
        }
    }
}
