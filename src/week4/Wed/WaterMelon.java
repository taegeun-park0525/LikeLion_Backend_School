package week4.Wed;

import java.util.Scanner;

public class WaterMelon {

    public static String solution(int n) {
        String waterMelon = "";
        for(int i=1; i<=n; i++) {
            if(i%2 == 1) {
                waterMelon += "수";
            } else if(i%2 == 0) {
                waterMelon += "박";
            }
        }
        return waterMelon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
