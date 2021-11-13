package DS;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Number_of_Occurrences_of_a_Substring {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<>();
        String s = "aababcaab";
        int maxLetter = 2;
        int minsize = 0;
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
