package DS;

import java.util.*;

public class DEMO {
    public static void main(String[] args) {
     int arr[] = {1000,8,9,4,8,2};
     Set <Integer> uni = new TreeSet<>();
     for (int i=0;i<arr.length;i++)
     {
         uni.add(arr[i]);
     }
        for (Integer integer : uni) {
            System.out.println(integer);
        }
    }
}
