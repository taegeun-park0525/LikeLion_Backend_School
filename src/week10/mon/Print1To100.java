package week10.mon;

import week8.thu.Solution;

public class Print1To100 {
    public static void print1To100(int n) {
        System.out.println(n);
        print1To100(n);
    }

    public static void main(String[] args) {
        print1To100(1);
    }
}
