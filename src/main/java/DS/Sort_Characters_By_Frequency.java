package DS;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        String s = "tree";
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        for (Character c : list) {
            int count = map.get(c);
            while (count>0)
            {
                sb.append(c);
                count--;
            }
        }
        System.out.println(sb);


    }
}
