package Week3.week3.Thu;

public class BubbleSort {
    public static void main(String[] args) {

        int[] a = {9,25,12,3,4,7,5,6,8,11,12,35};
        int tmp;
        for(int i = 0 ; i < a.length ; i ++) {
            for(int j = 0 ; j < a.length -i -1 ; j ++) {
                if(a[j]>a[j+1]) {
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }

        for(int i = 0 ; i < a.length ; i ++) {
            System.out.print(a[i]+ " ");
        }

    }
}
