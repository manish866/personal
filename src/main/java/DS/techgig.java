package DS;

import java.util.*;

public class techgig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=sc.next();
        }
        for (int i = 0; i < str.length; i++) {
            Map<Character,Integer> map = new HashMap<>();
            for (char c : str[i].toCharArray()) {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            int max=0;
            char ca=' ';
            for (Character c : map.keySet()) {
                if(map.get(c)>max)
                {
                    ca = c;
                }
            }
            System.out.println(ca);
        }
    }
}
