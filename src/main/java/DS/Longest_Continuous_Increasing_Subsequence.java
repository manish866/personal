package DS;

public class Longest_Continuous_Increasing_Subsequence {
    public static void main(String[] args) {
        int nums[] = {1,3,5,4,7};
        int count = 0;
        int maxi = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]<nums[i+1])
            {
                count++;
                maxi = Math.max(count,maxi);
            }
            else count=0;
        }
        System.out.println(maxi);
    }
}
