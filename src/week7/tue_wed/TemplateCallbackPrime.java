package week7.tue_wed;

import java.util.Arrays;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class TemplateCallbackPrime {
    /*Template callback 패턴을 생각해볼수있다?
    =>  i < num, i < num/2, i * i <= num  처럼 특정부분만 바뀜
    // i<num 연산하면 결과가 boolean
    public boolean primeNum1(int num, 함수 (파라미터가 2개) {
        for (int i = 2; 함수(i,num); i++) {
            if(num%i != 0){
                return false;
            }
        }
        return true;
    }
*/
    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i =2; stmt.compare(i, num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            boolean[] isPrime = new boolean[n + 1];
            Arrays.fill(isPrime, true);

            for(int i = 2 ; i <= n ; i ++) {
                if(isPrime[i] == false) continue;

                answer ++;
                for(int j = i * 2 ; j <= n ; j += i) {
                    isPrime[j] = false;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
//        System.out.println(tcp.isPrime(13, (a, b)-> a < b));
//        System.out.println(tcp.isPrime(17, (a, b)-> a < b/2));
//        System.out.println(tcp.isPrime(19, (a, b)-> a * a < b));
        Solution s = new Solution();
        System.out.println(s.solution(10));
        System.out.println(s.solution(5));
        System.out.println(s.solution(50));
    }

}
