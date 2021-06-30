package DS;

import java.util.HashSet;
import java.util.Set;

public class Analytical_thinking {
    public static void main(String[] args) {
        Set<Character> hs = new HashSet<>();
        String str = "abcbbk";
        int count=0;
        for (char c : str.toCharArray()) {
            if(!hs.contains(c))
                hs.add(c);
            else
                count++;

        }
        System.out.println(count);
    }
}
