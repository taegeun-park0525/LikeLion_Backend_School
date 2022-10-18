package Week5.Tue.Algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SquareStar ss = new SquareStar();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ss.printSquareMatrix(n);

    }
}
