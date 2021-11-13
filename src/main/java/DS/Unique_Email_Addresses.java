package DS;

import java.util.HashSet;
import java.util.Set;

public class Unique_Email_Addresses {
    public static void main(String[] args) {
        String s[] = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        int j=0;
        Set<String> set = new HashSet<>();
        while (j< s.length)
        {
            StringBuilder name = new StringBuilder();
            String domain="";
            for (int i = 0; i < s[j].toCharArray().length; i++) {
                char c = s[j].charAt(i);
                if(c=='@')
                {
                    domain = s[j].substring(i,s[j].length());
                    break;
                }
                else {
                    name.append(c);
                }

            }
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if(c=='+')
                    name.replace(i,name.length(),"");
                if(c=='.')
                    name.deleteCharAt(i);

            }
            String fin = name.toString().concat(domain);
            set.add(fin);
            j++;
        }
        System.out.println(set.size());

    }
}
