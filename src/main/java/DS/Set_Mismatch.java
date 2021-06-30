package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Mismatch {
    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        List<Integer> res = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        //int i=0;
        for (int num : nums) {
            if(!hs.contains(num))
                hs.add(num);
            else
            {
                res.add(num);
            }
        }
        int c=res.get(0)+1;
        res.add(c);
        int intArray[] = new int[res.size()];
       // intArray =res.toArray(intArray);
        for(int i=0;i<res.size();i++)
        {
            intArray[i]=res.get(i);
        }

        for (int i : intArray) {
            System.out.println(i);

        }



    }
}
