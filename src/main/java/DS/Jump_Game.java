package DS;

public class Jump_Game {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int li = nums.length-1;
        for (int i = nums.length-1; i >= 0; i--) {
            if(i+nums[i]>=li)
                li=i;
        }
        if (li==0)
            System.out.println("true");
    }
}
