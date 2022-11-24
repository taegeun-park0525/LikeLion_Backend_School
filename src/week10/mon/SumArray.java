package week10.mon;

import java.util.ArrayList;
import java.util.List;

public class SumArray {

    public static int SumFunction(List<Integer> nums) {

        if(nums.isEmpty()) return 0;
        return nums.remove(nums.size() - 1) + SumFunction(nums);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);

        int result = 0;
        int count = 0;

        result = SumFunction(nums);

        System.out.println(result);
    }
}
