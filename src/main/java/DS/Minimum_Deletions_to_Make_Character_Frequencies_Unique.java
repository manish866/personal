package DS;

import java.util.HashSet;

public class Minimum_Deletions_to_Make_Character_Frequencies_Unique {
    public static void main(String[] args) {
        String s = "aaabbbcc";
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        int del=0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]!=0 && set.contains(arr[i]))
            {
                arr[i]--;
                del++;
            }
            set.add(arr[i]);
        }
        System.out.println(set);
        System.out.println(del);
    }
}
