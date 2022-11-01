package week7.tue;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public boolean primeNum() {
        int count = 0;
        int[] arr = {13,17,19,23};
        for (int i = 1; i < arr[1]; i++) {
            if(arr[1]%i == 0){
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

        boolean result = pn.primeNum();
        System.out.println(result);
    }
}
