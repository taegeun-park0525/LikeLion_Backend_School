package week7.thu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
에라토스테네스 체 속독 개선의 핵심
1. add(), remove()하지 않는 것
2. %나머지 연산을 하지 않는 것
 */
public class PrimeNumber {

    public static void main(String[] args) {
        int N = 50; // N = 50
        int[] nums = new int[N - 1]; // N-1개만큼 2~50까지 총 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        //arrays.fill => 모든 배열의 값을 일괄 초기화하는 메서드
        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~50까지 nums에 채우기

        // 2의 배수 지우기
        // 0 1 2 3 4 5 6 7 8   9 10 11 12 13 14 15 16 17 18
        // 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ... 50
        int multipleOf = 2;
        for (int i = 2; i < nums.length; i += 2) {
            checks[i] = false;
        }
        //checks를 참고해 true인 nums[i]만 출력
        List<Integer> primes = new ArrayList<>();
        for (int i = 0; i < checks.length; i++) {
            if (checks[i]) primes.add(nums[i]);
        }
        System.out.println(primes);
        System.out.println(primes.size());

    }
}
