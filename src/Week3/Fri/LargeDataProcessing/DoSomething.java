package Week3.Fri.LargeDataProcessing;

import java.util.List;

public interface DoSomething<T> {
    List<T> work(String str);
}