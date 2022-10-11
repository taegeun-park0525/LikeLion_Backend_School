package Wekk4.Algorithm;

import java.util.Scanner;


public class SumOfDigit {
    public int Solution(int n) {
        // % 연산이용 몫, 나머지
        int result =0;

        while(n > 0) {
            result += n % 10;
            n = n /10;
        }

        return result;
    }
    public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(sod.Solution(num));
    }
}

