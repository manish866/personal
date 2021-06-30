package DS;

public class Largest_Odd_Number_in_String {
    public static void main(String[] args) {
        String num = "4206";
        int len = num.length();
        char res[] = num.toCharArray();
        for(int i=len-1;i>=0;i--)
        {
           if((res[i]-48)%2==0)
               res.toString();
        }
    }
}
