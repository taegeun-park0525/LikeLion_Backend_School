package Week3.Wed.collection.RandomAlphabetSet;

import java.util.HashSet;
import java.util.Set;

public class RndAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomAlphabetGenerator alphabetGenerator = new RandomAlphabetGenerator();
        Set<Character> randomAlphabetSet = new HashSet<>();

        for(int i=0; i <= 50; i++) {
            char alphabet = alphabetGenerator.generate(0);
            randomAlphabetSet.add(alphabet);
        }
        System.out.println(randomAlphabetSet);
    }
}
