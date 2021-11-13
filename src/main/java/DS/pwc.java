package DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pwc {
    public static void main(String[] args) {
        int ar[] = {2,5,7,5,8,5,7,7,6,5,7};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : ar) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        int c = map.get(ar[0]);
        int index = 0;

        for (Integer i : map.keySet())
        {
            if(c<map.get(i))
            {
                c = i;
                index=map.get(i);
                list.add(c);
            }
        }
        map.remove(c);
        for (Integer i : map.keySet()) {
            if(map.get(i)==index)
                list.add(i);
        }
        int min = Integer.MAX_VALUE;
        for (Integer i : list) {
            min=Math.min(min,i);
        }
        System.out.println(min);







    }
}
