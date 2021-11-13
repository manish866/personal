package DS;

import java.util.HashMap;
import java.util.Map;

public class Construct_K_Palindrome_Strings {
    public static void main(String[] args) {
        String s = "annabelle";
        int k = 2,count=0;
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Character c : map.keySet()) {
            if(map.get(c)%2!=0)
                count++;
        }
        System.out.println(count);
    }
}
