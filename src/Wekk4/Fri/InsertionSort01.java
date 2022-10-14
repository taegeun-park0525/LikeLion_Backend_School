package Wekk4.Fri;

class Sort {
    public static int[] sort(int[] arr) {
        int key;
        for (int i = 1; i < arr.length; i++) {

            key = i;

            for (int j = i - 1; j >= 0; j--) {
                if (arr[key] < arr[j]) {
                    int temp = arr[key];
                    arr[key] = arr[j];
                    arr[j] = temp;
                    key--;
                } else break;
            }
        }

        return arr;
    }
}

public class InsertionSort01 {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] arr = new int[]{8, 5, 6, 2, 4};

        for (int sortArr : Sort.sort(arr)) {
            System.out.printf("%d ", sortArr);
        }

    }
}