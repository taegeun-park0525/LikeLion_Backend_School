package week5.Tue.Algorithm;

public class ParallelogramStar {
    public void printParallelogramStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.printf(" ");
            }
            System.out.printf("*".repeat(n));
            System.out.println("");
        }
    }

}
