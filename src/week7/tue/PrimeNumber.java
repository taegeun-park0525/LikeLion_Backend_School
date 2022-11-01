package week7.tue;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    //나머지연산
    public boolean primeNum1(int num) {
        for (int i = 2; i < num; i++) {
            if(num%i != 0){
                return false;
            }
        }
        return true;
    }

    boolean primeNum2(int num) {
        for (int i = 2; i < num/2; i++) {
            if(num%i != 0){
                return false;
            }
        }
        return true;
    }
    public boolean primeNum3(int num) {
        for (int i = 2; i*i <= num; i++) {
            if(num%i != 0){
                return false;
            }
        }
        return true;
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
