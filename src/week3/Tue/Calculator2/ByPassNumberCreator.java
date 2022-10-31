package week3.Tue.Calculator2;

public class ByPassNumberCreator implements NumberCreator{
    @Override
    public int create(int num) {
        return num;
    }
}
