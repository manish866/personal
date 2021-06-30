package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        //List<Integer> res = new ArrayList<>();
         Set<Integer> hs = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int num : nums) {
            if(!hs.contains(num))
                hs.add(num);
            else
                res.add(num);
        }
        Object[] fin = res.toArray();
        for (Object o : fin) {
            System.out.println(o);
        }
    }
}
