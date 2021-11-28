package DS;

public class Minimum_Length_of_String_After_Deleting_Similar_Ends {
    public static void main(String[] args) {
        String s = "aabccabba";
        int left = 0;
        int right = s.length()-1;
        while (left<right && s.charAt(left)==s.charAt(right))
        {
            char c = s.charAt(left);
            while (left<right && c==s.charAt(left))
                left++;
            while (left<=right && c==s.charAt(right))
                right--;
        }
        String str = s.substring(left,right);
        System.out.println(str);
        System.out.println(right - left + 1);
    }
}
