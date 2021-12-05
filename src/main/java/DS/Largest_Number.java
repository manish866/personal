package DS;

import java.util.ArrayList;
import java.util.List;

public class Largest_Number {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        List<Integer> single = new ArrayList<>();
        for (int i : nums) {
            if(i>=0 && i<=9)
                single.add(i);
        }
        System.out.println(single);
    }
}
