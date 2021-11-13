package DS;

import java.util.ArrayList;
import java.util.List;

public class Rec_LeetCode_Subset {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        backtrack(nums,0,res,cur);
    }
    public static void backtrack(int[] nums,int start,List<List<Integer>> res,List<Integer> cur)
    {
        res.add(new ArrayList<>(cur));

        for (int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            backtrack(nums,i+1,res,cur);
            cur.remove(cur.size()-1);
        }

        System.out.println(res);
    }
}
