package Week5.algorithm;

public class RightTriangle {
    public void PrintRightTriangle(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
