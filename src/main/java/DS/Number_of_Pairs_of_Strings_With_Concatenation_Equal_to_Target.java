package DS;

public class Number_of_Pairs_of_Strings_With_Concatenation_Equal_to_Target {
    public static void main(String[] args) {
        String[] nums = {"777","7","77","77"};
        String target = "7777";
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j)
                    if(nums[i].concat(nums[j]).equals(target))
                    count++;
            }
        }
        System.out.println(count);
    }
}
