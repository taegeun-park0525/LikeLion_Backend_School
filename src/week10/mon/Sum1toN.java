package week10.mon;

import java.util.Scanner;

public class Sum1toN {
    public static int SumFunction(int n, int count, int result) {
        count ++;

        if(count > n) {
            return result;
        }

        result = result + count;
        return SumFunction(n, count, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int count = 0;

        result = SumFunction(n,count, result);

        System.out.println(result);
    }
}
