package Week3.week3.Thu;

public class BubbleSort {
    public static void main(String[] args) {

        int[] bubbleArr = {9,25,12,3,4,7,5,6,8,11,12,35};
        int tmp;
        for(int i = 0 ; i < bubbleArr.length ; i ++) {
            for(int j = 0 ; j < bubbleArr.length -i -1 ; j ++) {
                if(bubbleArr[j]>bubbleArr[j+1]) {
                    tmp = bubbleArr[j];
                    bubbleArr[j] = bubbleArr[j+1];
                    bubbleArr[j+1] = tmp;
                }
            }
        }

        for(int i = 0 ; i < bubbleArr.length ; i ++) {
            System.out.print(bubbleArr[i]+ " ");
        }

    }
}
