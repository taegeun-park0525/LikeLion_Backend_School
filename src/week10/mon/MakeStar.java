package week10.mon;

import java.util.Scanner;

public class MakeStar {
    public static void StarPrint(int n,int count) {
        count ++;
        System.out.print("*");
        if(count == n) {
            return;
        }
        StarPrint(n,count);
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StarPrint(n,count);
    }
}
