package DS;

import java.util.*;

public class Sorting_element_of_an_array_by_frequency_in_decreasing_order {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 5, 6, 4, 2, 2, 8, 5 };
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int i : arr) {
            treeMap.put(i, treeMap.getOrDefault(i,0)+1);
        }
            Map<Integer,Integer> map = new HashMap<>();

    }
}
