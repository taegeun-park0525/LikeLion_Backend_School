package week9.fri;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        for (int i = 0; i < str.length(); i++) {
            System.out.println((char)(str.charAt(i)+1));
        }

    }
}
