package DS;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Number_of_Matching_Subsequences {
    public static void main(String[] args) {

        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};
        Map<Character, Queue<String>> map = new HashMap<>();
        int ans=0;
        for (int i=0;i<s.length();i++)
            map.putIfAbsent(s.charAt(i),new LinkedList<>());
        for (String word : words) {
            char startchar = word.charAt(0);
            if (map.containsKey(startchar))
                map.get(startchar).offer(word);
        }


        for (int i = 0; i < s.length(); i++) {
            char startchar = s.charAt(i);
            Queue<String> q = map.get(startchar);
            int size = q.size();
            for (int i1 = 0; i1 < size; i1++) {
                String str = q.poll();
                if (str.substring(1).length()==0)
                {
                    ans++;
                }
                else
                {
                    if (map.containsKey(str.charAt(1)))
                    {
                        map.get(str.charAt(1)).add(str.substring(1));
                    }
                }
            }
        }
        System.out.println(ans);

    }
}
