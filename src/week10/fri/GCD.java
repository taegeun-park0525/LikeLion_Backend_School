package week10.fri;

import java.util.Scanner;

//Greatest Common Divisor
public class GCD {

    public static void printGCD(int num1, int num2) {
        if (num1 - num2 == 0) {
            System.out.println(num1);
            return;
        } else if(num1 > num2) {
            num1 = num1 - num2;
            System.out.printf("num1 : %d , num2 : %d\n", num1,num2);
        } else if(num2 > num1) {
            num2 = num2 - num1;
            System.out.printf("num1 : %d , num2 : %d\n", num1,num2);
        } else {
            System.out.printf("%d와 %d의 최대공약수는 없습니다.",num1, num2);
            return;
        }

        printGCD(num1,num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        printGCD(num1,num2);
    }
}
