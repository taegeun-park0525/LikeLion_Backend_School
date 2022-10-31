package baby_Lion;
public class VariableExercise {
    public static void main(String[] args) {
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int[] arr = new int[] {50000,10000,5000,1000,500,100,50,10};
        // 계산기

        //arr0 + arr1 ---- result1
        //arr2 * arr3 ---- result2
        // result1 - result2 ------ result3

        result1 = arr[0] + arr[1];
        result2 = arr[2] * arr[3];
        result3 = result1-result2;

        System.out.printf(" result1 = %d \n result2 = %d \n result3 = %d", result1, result2, result3);
    }
}
