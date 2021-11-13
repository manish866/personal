package DS;

import java.util.ArrayList;
import java.util.List;

public class Largest_Number_At_Least_Twice_of_Others {
    public static void main(String[] args) {
        int nums[] = {3,6,1,0};
        int max=0;
        List<Integer> ele = new ArrayList<>();
        for (int i : nums) {
            ele.add(i);
            max=Math.max(max,i);
        }
        System.out.println(ele.indexOf(max));
        int ind = ele.indexOf(max);
        ele.remove(ele.indexOf(max));

        List<Integer> list = new ArrayList<>();
        for (int i : ele) {
            list.add(i*2);
        }
        System.out.println(ele);
        for (Integer i : list) {
            if(i>max)
                System.out.println("-1");
        }
        System.out.println(ind);

    }
}
