package DS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bhargav_ANZ_3 {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        s.add(10);
        s.add(10);
        s.add(20);
        s.add(10);
        s.add(10);
        s.add(10);

        t.add(20);
        t.add(20);
        t.add(10);
        t.add(20);
        t.add(20);
        t.add(30);

        System.out.println(s+" ");
        System.out.print(t+" ");

        Map<Integer,Integer> sRes = new HashMap<>();
        Map<Integer,Integer> tRes = new HashMap<>();

        for (Integer i : s) {
            sRes.put(i,sRes.getOrDefault(i,0)+1);
        }
        for (Integer i : t) {
            tRes.put(i,tRes.getOrDefault(i,0)+1);
        }
        String flag = "";
        for (Integer i : tRes.keySet()) {
            if(sRes.containsKey(i))
            {

            }
        }
    }
}
