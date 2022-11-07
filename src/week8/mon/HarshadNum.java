package week8.mon;

import java.util.ArrayList;
import java.util.List;

public class HarshadNum {
    public boolean solution(int x) {
        int result = 0;
        int quotient = x;
        while(quotient > 0) {
            result += quotient%10;
            quotient = quotient / 10;
            System.out.println(result);
        }
        if (x%result == 0) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        HarshadNum harshadNum = new HarshadNum();
        System.out.println(harshadNum.solution(18));

    }
}
