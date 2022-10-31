package week3.Wed.collection.RandomNumSet;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithdoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer > randomNumberSet = new HashSet<>(); // set 만들어줌

        for (int i = 0; i < 100; i++){
            int r = randomNumberGenerator.generate(30);
            System.out.println(r);
            randomNumberSet.add(r);
        }

        System.out.println(randomNumberSet);
        System.out.println(randomNumberSet.size());
    }
}
