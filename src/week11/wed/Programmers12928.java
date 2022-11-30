package week11.wed;

public class Programmers12928 {

    public static int divisorSum(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i == 0) {
                total = total + i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(divisorSum(num));
    }
}
