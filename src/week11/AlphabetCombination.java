package week11;

public class AlphabetCombination {

    public static void oneAlpha(){
        char[] alphabat = new char[26];

        for(int i = 0; i<alphabat.length; i++){
            alphabat[i] =(char)('A' + i);
            System.out.print(alphabat[i]);
        }
    }
    public static void main(String[] args) {
        oneAlpha();

    }
}
