package week3.Wed.collection.RandomAlphabetSet;

public class RandomAlphabetGenerator implements GenerateAlphabet{
    @Override
    public char generate(int num) {
       int rndNum = (int)(Math.random()*26);
        char alphabet = (char)(rndNum + 64);
        return alphabet;
    }
}
