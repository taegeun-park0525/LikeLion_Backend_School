package week7.tue;

public class TemplateCallbackPrime {
    /*Template callback 패턴을 생각해볼수있다?
    =>  i < num, i < num/2, i * i <= num  처럼 특정부분만 바뀜
    // i<num 연산하면 결과가 boolean
    public boolean primeNum1(int num, 함수 (파라미터가 2개) {
        for (int i = 2; 함수(i,num); i++) {
            if(num%i != 0){
                return false;
            }
        }
        return true;
    }
*/
    boolean someOperation(int a, int b) {
        return a<b;
    }

    boolean isPrime(int num) {
        for (int i =2; someOperation(i, num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallbackPrime tcp = new TemplateCallbackPrime();
        boolean r = tcp.isPrime(17);
        System.out.println(r);
    }
}
