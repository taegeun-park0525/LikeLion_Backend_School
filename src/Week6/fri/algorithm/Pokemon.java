package Week6.fri.algorithm;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    /*
    포켓몬 이 들어있는 배열을 받음
    포켓몬은 숫자로 이름이 붙여져있음 ex) 1, 2, 3
    배열안에는 포켓몬이 짝수로 들어있고, 내가 가져갈 수 있는 포켓몬은 배열의길이/2 개임
    이중 내가 가져올때 가장 많은 종류의 포켓몬을 선택
     */
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        int max = nums.length / 2;

        for (int idx : nums) {
            set.add(idx);
        }

        if (max > set.size()){
            answer = set.size();
        }else{
            answer = max;
        }
        return answer;
    }
}
