package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Substrings_of_Size_Three_with_Distinct_Characters {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int count=0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length()-2; i++) {
            String sub = s.substring(i,i+3);

            for (char c : sub.toCharArray()) {
                set.add(c);
            }
            if(set.size()==3)
                count++;
            set.clear();
        }
        System.out.println(count);
    }
}
