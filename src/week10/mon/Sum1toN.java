package week10.mon;

import java.util.Scanner;

public class Sum1toN {
    public static void SumFunction(int n, int count, int result) {
        count ++;
        System.out.println(result);

        if(count > n) {
            return;
        }

        result = result + count;
        SumFunction(n, count, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int count = 0;

        SumFunction(n,count,result);

        System.out.println(result);
    }
}
