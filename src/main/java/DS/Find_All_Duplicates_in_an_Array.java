package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        Set<Integer> hs = new HashSet<>();
        List<Integer> ls = new ArrayList<>();
        for (int num : nums) {
            if(!hs.contains(num))
                hs.add(num);
            else
                ls.add(num);

        }
    }
}
