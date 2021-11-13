package DS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SAP {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            linkedHashMap.put(c, linkedHashMap.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : linkedHashMap.keySet()) {
            String ch =c.toString();
            String nu = String.valueOf(linkedHashMap.get(c));
            sb.append(ch.concat(nu)+" ");
        }
        System.out.println(sb);
    }
}
