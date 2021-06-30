package DS;

import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        int nums[] = {2,1,2,5,3,2};

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            } else System.out.println(num);;
        }
    }
}
