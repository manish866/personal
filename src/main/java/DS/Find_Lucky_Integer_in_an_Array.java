package DS;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Find_Lucky_Integer_in_an_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=0;
        for (Integer i : map.keySet()) {
            if(i==map.get(i))
            {
                max=Math.max(max,i);
            }
        }
        System.out.println(max);
    }
}
