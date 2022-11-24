package week10.thu;

import java.util.Scanner;

public class CodeUp1859 {
    public static String getStars(int num) {
        if(num == 0) return "";
        return "*" + getStars(num-1);
    }
    public static void printStar(int num){
        if(num == 0) return;
        printStar(num -1 );
        System.out.println(getStars(num));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printStar(num);
    }
}
