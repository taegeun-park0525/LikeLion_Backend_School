package week5.Tue.Algorithm;

public class RecursiveStar {
        public void printTriangle(int n){
            if(n==1){
                System.out.println("*");
                return;
            }
            printTriangle(n-1);
            System.out.println("*".repeat(n));
        }

        public static void main(String[] args) {
            RecursiveStar rcs = new RecursiveStar();
            rcs.printTriangle(4);
        }
}
