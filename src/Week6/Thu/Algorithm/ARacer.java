//동명이인 이슈 처리안됨
package Week6.Thu.Algorithm;

import java.util.HashMap;
import java.util.Map;


public class ARacer {

    public String solution(String[] participant, String[] completion) {
        //1. HashMap에 Participant를 모두 넣는다.
        //2. completion에 들어있는 이름을 key로해서 HashMap에 검색합니다. 있으면 0으로 check
        //3. momo를 한바퀴 돌면서1인 값을 찾습니다.
        //4. Participant에 1명이 남습니다. 그 한명을 return

//        Map<String, Integer> memo = new HashMap<>();
//        for (int i = 0; i <participant.length; i++) {
//            String key = participant[i];
//            memo.put(key, 1); //모두 1로 초기화
//        }
//        for (int i = 0; i <completion.length; i++) {
//            String key = completion[i]; // value 1
//            memo.put(key,0);
//        }
//        String answer = "";
//        for(String key : memo.keySet()) {
//           if (memo.get(key) == 1) {
//               answer =  key;
//           }
//        }

        Map<String, Integer> memo = new HashMap<>();
        String answer = "";
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            memo.put(key, 1);
        }
        for (int i = 0; i < completion.length; i++) {
            String key = completion[i]; // value 1
            memo.put(key, 0);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ARacer aRacer = new ARacer();
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};
        String Answer = aRacer.solution(participant, completion);

        System.out.println(Answer);

    }
}
