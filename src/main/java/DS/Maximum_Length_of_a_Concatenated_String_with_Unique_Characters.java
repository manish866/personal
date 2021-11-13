package DS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maximum_Length_of_a_Concatenated_String_with_Unique_Characters {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("un");
        arr.add("iq");
        arr.add("ue");
        int max=0;
        List<String> ans = new ArrayList<>();
        ans.add("");
        for (String s : arr) {
            if(!check(s))
                continue;
            List<String> newAns = new ArrayList<>();
            for (String an : ans) {
                String temp = an+s;
                if(check(temp))
                {
                    newAns.add(temp);
                    max=Math.max(max,temp.length());
                }
            }
            ans.addAll(newAns);
        }
        System.out.println(max);
    }
    private static boolean check(String str)
    {
        if(str.length()>26)
            return false;
        int[] freq = new int[26];
        char[] ch = str.toCharArray();
        for (char c : ch) {
            freq[c-'a']++;
            if(freq[c-'a']>1)
                return false;

        }
        return true;
    }

}
