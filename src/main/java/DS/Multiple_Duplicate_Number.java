package DS;

import java.util.Arrays;

public class Multiple_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {5,1,5,3,3};
        Arrays.sort(nums);
        for (int i = 0; i <nums.length; i++) {
           if(i+1==nums[i])
               continue;
           else nums[i]=-1;
        }
        for (int i = 0; i < nums.length; i++) {
            i=Math.abs(nums[i])-1;

        }
    }
}
