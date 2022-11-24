package week10.thu;

import java.util.Scanner;

public class CodeUp1860 {

    public static int printNum(int num, int count, int numCount) {
        if(numCount == count) {
            System.out.println(numCount + " ");
            count ++;
            if (num < count) return 0;
            numCount = 1;
            return printNum(num,count,numCount);
        }
        System.out.print(numCount+ " ");
        numCount ++;
        return printNum(num, count, numCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int numCount = 1;
        printNum(num, count, numCount);
    }
}
