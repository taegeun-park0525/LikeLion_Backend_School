package Wekk4.Wed;


interface Operation {
    int operation(int a, int b);
}


public class GugudanPlus {
    // * 를 +로 바꾸려면?
    public void Gugudanprint(int dan, String operator, Operation operation) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, operator,i,Operation.operation(dan,i));
        }
    }

    public static void main(String[] args) {
        GugudanPlus ggd = new GugudanPlus();
        int dan = 2;
    }
}
