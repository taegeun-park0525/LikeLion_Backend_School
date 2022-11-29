package week11.mon;

public class AlphabetCombination {

    public static void oneAlpha(){
        char[] alphabat = new char[26];

        for(int i = 0; i<alphabat.length; i++){
            alphabat[i] =(char)('A' + i);
            System.out.print(alphabat[i]);
        }
    }

    public static void twoAlpha(){
        char[] alphabat = new char[26];
        for(int i = 0; i<alphabat.length; i++){
            alphabat[i] =(char)('A' + i);
            for (int j = 0; j < alphabat.length; j++) {
                System.out.print(alphabat[i]);
                System.out.println(alphabat[j]);
            }
        }

    }

    public static void printAlpha(char c){
    if(c>'Z') return;
        System.out.println(c);
        printAlpha((char)(c+1));
    }
    public static void main(String[] args) {
        twoAlpha();
        char c = 'A';
        printAlpha(c);
    }
}
