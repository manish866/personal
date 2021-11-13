package DS;

import java.util.ArrayList;
import java.util.List;

public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {
        int nums[] = {4,2,5,7};
        int res[] = new int[nums.length];
        int even=0,odd=1;
        for (int i : nums) {
            if(i%2==0)
            {
                res[even]=i;
                even+=2;
            }
            else {
                res[odd]=i;
                odd+=2;
            }
        }
        for (int i : res) {
            System.out.println(i);
        }
    }
}
