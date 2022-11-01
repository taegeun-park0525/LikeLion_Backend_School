package week7.tue;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public boolean primeNum1(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i == 0){
                count++;
            }
        }
        return count == 2;
    }


    public int solution(int n) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                
            }             
        }
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        int[] arr = {13,17,19,23};
        boolean result = pn.primeNum1(arr[1]);
        System.out.println(result);
    }
}
