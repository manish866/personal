package DS;

import java.util.HashSet;
import java.util.Set;

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};
        Set<Integer> dup = new HashSet<>();
        for (int num : nums) {
            if(!dup.contains(num))
                dup.add(num);
            else
                System.out.println(num);

        }
    }
}
