package DS;

import java.util.Arrays;
import java.util.Stack;


public class Next_Greater_Element_II {
    public static void main(String[] args) {        //if no ele gre then -1
        int nums[] = {1,2,3,4,3};
        int n=nums.length;
        int res[] = new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            while (!st.isEmpty() && nums[st.peek()]<nums[i%n])
                res[st.pop()] = nums[i%n];
            st.push(i%n);
        }
        for (int re : res) {
            System.out.println(re);
        }
    }
}
