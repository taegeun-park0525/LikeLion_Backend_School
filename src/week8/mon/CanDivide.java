package week8.mon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CanDivide {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        if(answer.size() == 0) answer.add(-1);
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        CanDivide canDivisor = new CanDivide();
        int[] arr = {5,9,7,10};
        int divisor = 5;
        canDivisor.solution(arr, divisor);
    }
}
