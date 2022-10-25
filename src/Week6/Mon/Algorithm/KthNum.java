package Week6.Mon.Algorithm;

import java.util.Arrays;

public class KthNum {
    public int[] solution1(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int[] sliceArr = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(sliceArr);
            answer[idx++] = sliceArr[command[2] - 1];

        }
        return answer;
    }


    public static void main(String[] args) {
        KthNum kthnum = new KthNum();
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[] answer = kthnum.solution1(array, commands);

        System.out.println(Arrays.toString(answer));
    }
}
