package DS;

import java.util.*;

public class Top_K_Frequent_Words {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        Map<String,Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>(map.keySet());
        System.out.println(pq);


    }
}
