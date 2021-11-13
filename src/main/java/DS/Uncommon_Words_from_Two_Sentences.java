package DS;

import java.util.HashSet;
import java.util.Set;

public class Uncommon_Words_from_Two_Sentences {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] s11 = s1.split(" ");
        String[] s22 = s2.split(" ");
        Set<String> set = new HashSet<>();
        for (String s : s11) {
            set.add(s);
        }
        for (String s : s22) {
            if(set.contains(s))
                set.remove(s);
            else set.add(s);
        }
        String[] str = set.toArray(new String[set.size()]);


    }
}
