package DS;

import java.util.HashMap;
import java.util.Map;

public class Ransom_Note383_ {
    public static void main(String[] args) {
        String ransomNote="a";
        String  magazine="b";
        boolean b = false;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: ransomNote.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        System.out.println(map);
        for (char ch: magazine.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) - 1);
        }
        System.out.println(map);
        for (Character key: map.keySet()) {
            if (map.get(key) > 0)
                b= false;
            else b=true;
        }
        System.out.println(b);


    }
}
