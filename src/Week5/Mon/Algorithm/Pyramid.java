package Week5.Mon.Algorithm;

public class Pyramid {
    public void PrintPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num-i ; j++) {
                System.out.printf(" ");
            }
            for (int j = 1; j < i*2; j++ ){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
