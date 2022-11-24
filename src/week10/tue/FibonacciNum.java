package week10.tue;


public class FibonacciNum {
    public static int fib(int n) {
        // n이 1이나 2가 들어오면 재귀를 안타고 return
        if(n==1 | n == 2) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
    int r = fib(6);
        System.out.println(r);
    }
}
