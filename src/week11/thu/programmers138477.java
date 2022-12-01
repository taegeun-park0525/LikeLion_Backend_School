package week11.thu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
매일 출연한 가수의 점수가 지금까지출연 가수들의 점수 중 상위 k번째 이내이면 해당 가수의 점수를 명예의 전당에 올림
프로그램 시작이후 초기 k일까지는 모든 출연 가수의 점수가 명예의 전당에 오르게됨
k번째 순위의 가수 점수보다 더 높으면, 출연 가수의 점수가 명예의 전당에 오르게 되고, 기존의 K번째 순위의 점수는 명예의전당에서 내려오게 됩니다.

 명예의전당의 최하위 점수를 발표
 k=3이고 7일 동안 진행된 가수의 점수가 [10, 100, 20, 150, 1, 100, 200] 이라면
 명예의 전당에서 발표된 점수는 [10,10,10,20,20,100,100] 입니다.

k크기의 answer이라는 list을 만든다.
score[i]를 하나씩 answer에 넣는데, answer가 k만큼의 크기가 되면,
그이후로는 answer에서의 가장 작은값을 score[i]와 비교하여 score[i]가 더 클경우 값을 교체한다.
i가 증가하는 회차마다 answer의 최소값을 구해서 (정렬을해서) 0번째 answer[0] (가장작은값)을 뽑아낸다.
 */

public class programmers138477 {

    public static int[] solution(int k, int[] score) {
        List<Integer> presentaion = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            if (presentaion.size() < k) {
                presentaion.add(score[i]);
            } else {
                if (presentaion.get(0) < score[i]) {
                    presentaion.remove(0);
                    presentaion.add(score[i]);
                }
            }
            Collections.sort(presentaion);
            answer[i] = presentaion.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution(k, score)));
    }
}
