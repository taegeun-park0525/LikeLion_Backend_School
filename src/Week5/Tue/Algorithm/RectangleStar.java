package Week5.Tue.Algorithm;

public class RectangleStar {
    public void printRectangleMatrix(int n, int m) {
        System.out.printf("%d*%d 별을 출력합니다.\n",n,m);
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(m));
        }
    }
}
