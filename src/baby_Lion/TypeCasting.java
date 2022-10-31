package baby_Lion;

public class TypeCasting {
    public static void divide(int first, int second) {
        float fFirst = (float) first;
        float fSecond = (float) second;
        float result = fFirst / fSecond;
        System.out.println(result);
    }
    public static void main(String[] args) {
        int first = 1;
        int second = 2;

        System.out.println(2/3);
        divide(first, second);

    }
}
