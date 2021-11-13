package DS;

import java.util.ArrayList;
import java.util.List;

public class Smallest_Index_With_Equal_Value {
    public static void main(String[] args) {
        int nums[] = {4,3,2,1};

        for (int i = 0; i < nums.length; i++) {
            if(i%10==nums[i])
                System.out.println(i);
        }
    }
}
