package week8.thu;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {

        List<Integer> answerList = new ArrayList<>();
        answerList.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            // list의 마지막 번째와 arr의 현재 값 비교
            if (answerList.get(answerList.size() - 1) != arr[i]) answerList.add(arr[i]);
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public int[] solution2(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        // 비교해서 stack에 넣기
        for (int i = 1; i < arr.length; i++) {
            if (st.peek() != arr[i]) st.push(arr[i]);
        }

        var answer = new int[st.size()];
        // 거꾸로 꺼내기
        for (int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        solution.solution(arr);
        solution.solution2(arr);
    }
}
