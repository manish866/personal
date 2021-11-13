package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Two_Out_of_Three {
    public static void main(String[] args) {
        int[] num1 = {1,1,3,2};
        int[] num2 = {2,3};
        int[] num3 = {3};

        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i : num1) {
            list1.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i : num2) {
            list2.add(i);
        }
        List<Integer> list3 = new ArrayList<>();
        for (int i : num3) {
            list3.add(i);
        }

        if(list1.size()>=list2.size())
        {
            for (Integer i : list1) {
                if(list2.contains(i))
                    list.add(i);
            }
        }
        else
        {
            for (Integer i : list2) {
                if(list1.contains(i))
                    list.add(i);
            }
        }
        if(list2.size()>=list3.size())
        {
            for (Integer i : list2) {
                if(list3.contains(i))
                    list.add(i);
            }
        }
        else
        {
            for (Integer i : list3) {
                if(list2.contains(i))
                    list.add(i);
            }
        }
        if(list3.size()>=list1.size())
        {
            for (Integer i : list3) {
                if(list1.contains(i))
                    list.add(i);
            }
        }
        else
        {
            for (Integer i : list1) {
                if(list3.contains(i))
                    list.add(i);
            }
        }

        System.out.println(list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
        list.clear();
        for (Integer i : set) {
            list.add(i);
        }
        System.out.println(list);



    }
}
