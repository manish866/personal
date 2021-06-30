package DS;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};
        int res[] = new int[nums.length];
        int i=0;
        for (int num : nums) {
            res[i]=num*num;
            i++;
        }
        Arrays.sort(res);
        for (int re : res) {
            System.out.println(re);

        }


    }
}
