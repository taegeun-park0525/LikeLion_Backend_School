package week5.Tue.Algorithm;

public class DonutSquare {
    public void printDonutSquare(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("*");
            if(i==0 || i==n-1) {
                System.out.printf("*".repeat(n-2));
            } else {
                System.out.printf(" ".repeat(n-2));
            }
            System.out.printf("*\n");
        }
    }
}
