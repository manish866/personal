package DS;

import java.util.HashMap;
import java.util.Map;

public class Check_if_All_Characters_Have_Equal_Number_of_Occurrences {
    public static void main(String[] args) {
        String s = "abacbc";
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int x =0;
        for (Character c : map.keySet()) {
            x = map.get(c);
            break;
        }
        for (Character c : map.keySet()) {
            if(x!=map.get(c))
                System.out.println("false");
        }
    }
}
