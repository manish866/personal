package DS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println(list.get(k-1));
    }
}
