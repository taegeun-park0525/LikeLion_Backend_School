package Week6.Algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNum_PriorityQueue {

    public int getKthNum(int[] arr, int[] command) {
        int frIdx = command[0]; //0번 from
        int toIdx = command[1]; //1번  to
        int nth = command[2]; // n번째

        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = frIdx-1; i < toIdx ; i++) {
            pq.add(arr[i]);
        }
        for (int i=0; i < nth; i++) {
            result = pq.poll();
        }
        return result;
    }
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i <commands.length; i++) {
            answer[i] = getKthNum(array,commands[i]);
        }
        return answer;
    }


    public static void main(String[] args) {
        KthNum_PriorityQueue kthnum = new KthNum_PriorityQueue();
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[] answer = kthnum.solution(array, commands);

        System.out.println(Arrays.toString(answer));
    }
}
