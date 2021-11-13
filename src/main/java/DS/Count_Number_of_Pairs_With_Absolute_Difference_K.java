package DS;

public class Count_Number_of_Pairs_With_Absolute_Difference_K {
    public static void main(String[] args) {
        int nums[] = {1,2,2,1};
        int k = 1;
        int sum=0,count=0;
        for (int i = 0; i < nums.length; i++) {
            sum=0;
            for (int j = i+1; j < nums.length; j++) {
               sum=Math.abs(nums[i]-nums[j]);
               if(sum==k)
                   count++;
            }
        }
        System.out.println(count);
    }
}
