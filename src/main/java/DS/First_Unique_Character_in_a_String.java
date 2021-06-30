package DS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s = "leetcode";
        char ch[] = s.toCharArray();
        Map<Character,Integer> map = new HashMap();
        for(char c: ch)
            map.put(c,map.getOrDefault(c,0)+1);
        for (int i = 0; i < ch.length; i++) {
            if(map.get(ch[i])==1)
            System.out.println(map.get(ch[i]));
            System.out.println(i);
            break;
        }
        int k=10;

    }
}
