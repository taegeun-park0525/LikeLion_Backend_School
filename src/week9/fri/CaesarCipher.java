package week9.fri;

import java.util.Scanner;

        /* 예외사항으로 둘것

        1. 공백이 있으면 그대로 공백으로 남게 해야함
        2. Z, z 마지막에있는 알파뱃은 A, a로 돌아오게 해야함.
        3. n을 입력받아 얼만큼 밀건지 정해야함.
         */

public class CaesarCipher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        num = num % 26;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int cipher = (int) ch + num;
            if (ch != ' ') {
                if (ch < 91 && ch > 64) {
                    if (cipher > 90) {
                        cipher = cipher - 26;
                    }
                    System.out.print((char) cipher);
                }
                if (ch < 123 && ch > 96) {
                    if (cipher > 122) {
                        cipher = cipher - 26;
                    }
                    System.out.print((char) cipher);
                }
            } else System.out.print(' ');
        }
    }
}
