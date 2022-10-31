package week5.Tue.Algorithm;

public class SquareStar {
    public void printSquareMatrix(int n) {
        System.out.printf("%d*%d 별을 출력합니다.\n",n,n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
