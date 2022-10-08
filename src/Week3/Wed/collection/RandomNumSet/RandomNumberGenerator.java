package Week3.Wed.collection.RandomNumSet;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random()*num);
    }
}
