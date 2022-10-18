package Week5.Mon.Algorithm;

import java.util.Scanner;

public class StarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("반복될 줄 수 를 입력하세요.");
        int num = sc.nextInt();

        RightTriangle rt = new RightTriangle();
//        rt.PrintRightTriangle(num);

        Pyramid py = new Pyramid();
//        py.PrintPyramid(num);

        Rhombus rh = new Rhombus();
        rh.PrintRhombus(num);
    }
}
