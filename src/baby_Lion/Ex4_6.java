package baby_Lion;

public class Ex4_6 {
    public static void main(String[] args) {
        int month = 8;

        switch (month) {
            case 3 : case 4: case 5:
                System.out.printf("봄");

            case 6 : case 7 : case 8:
                System.out.printf("여름");

            case 9 : case 10 : case 11:
                System.out.printf("가을");

            default:
                System.out.printf("겨울");
        }
    }
}