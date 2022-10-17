package Week5.algorithm;

public class RightTriangle {
    public void PrintRightTriangle(int num){
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < i; j=j+2) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
