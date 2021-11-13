package DS;

public class Make_Sum_Divisible_by_P {
    public static void main(String[] args) {
        int nums[] = {3,1,4,2};
        int p = 6;
        int sum=0;
        for (int i : nums) {
            sum+=i;
        }
        if(sum%p==0)
            System.out.println("0");
    }
}
