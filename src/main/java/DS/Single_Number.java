package DS;

import java.util.*;

public class Single_Number {
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        Set<Integer> st = new HashSet<>();
        for (int num : nums) {
            if (!st.contains(num))
                st.add(num);
            else
                st.remove(num);
        }
        int res[] = new int[1];
        for (int integer : st) {
            res[0] = integer;
        }
        System.out.println(res[0]);
    }
}
