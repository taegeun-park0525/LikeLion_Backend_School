package week8.mon;

import java.util.ArrayList;
import java.util.List;

public class HarshadNum {
    public boolean solution(int x) {
        List<Integer> arr = new ArrayList<>();
        while(x > 0) {
            arr.add(x%10);
            x = x / 10;
        }
        System.out.println(arr);
        boolean answer = true;
        return answer;
    }

    public static void main(String[] args) {
        HarshadNum harshadNum = new HarshadNum();
        int x = 18;
        List<Integer> arr = new ArrayList<>();
        while(x > 0) {

            arr.add( x%10 );
            x = x / 10;
        }
        System.out.println(arr);
    }
}
