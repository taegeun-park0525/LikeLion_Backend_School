package week10.thu;

import java.util.Scanner;

public class CodeUp1855 {
    public static int fib(int n) {
        // n이 1이나 2가 들어오면 재귀를 안타고 return
        if(n==1 | n == 2) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = fib(num);
        System.out.println(r);
    }
}
