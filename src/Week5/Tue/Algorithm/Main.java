package Week5.Tue.Algorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SquareStar ss = new SquareStar();
        RectangleStar rs = new RectangleStar();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //ss.printSquareMatrix(n);
        rs.printRectangleMatrix(n,m);
    }
}
