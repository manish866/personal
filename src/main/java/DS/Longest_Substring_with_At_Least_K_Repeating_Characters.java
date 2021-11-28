package DS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Longest_Substring_with_At_Least_K_Repeating_Characters {
    public static void main(String[] args) {
        String s = "ababacb";
        int k = 3;
        int res = 0;
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        for (Character c : map.keySet()) {
            if(map.get(c)>=k)
            {
                res+=map.get(c);
            }
        }
        System.out.println(res);

    }
}
