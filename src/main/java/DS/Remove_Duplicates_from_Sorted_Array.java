package DS;

import java.util.*;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        Set<Integer> NoDup = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int num : nums) {
            if(!NoDup.contains(num))
                NoDup.add(num);
        }
        for (Integer integer : NoDup) {
            res.add(integer);
        }
        Object x[] = res.toArray();
        for (Object o : x) {
            System.out.println(o);
        }
     }
}
