package Week3.Wed.collection.CountAlphabet;

import java.util.HashMap;

public class AlphabetCnt {

    public boolean isAlphabet(char c){
        if((c >= 'A' && c< 'Z') || (c >= 'a' && c< 'z')){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();
        String repoAddr = "aadfd::cddefjjkkllmm".toUpperCase();

        HashMap<Character,Integer> alphabetMap = new HashMap<>();
        for (char c='A'; c < 'Z'; c++) {
            alphabetMap.put(c, 0);
        }

        for (int i = 0; i < repoAddr.length(); i++){
            char c = repoAddr.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if (isAlphabet){
                //여기에서만 개수를 센다.
                int value = alphabetMap.get(c);
                value += 1;
                alphabetMap.put(c,alphabetMap.get(c) + 1);
            }

        }

        System.out.println(alphabetMap);

    }
}
