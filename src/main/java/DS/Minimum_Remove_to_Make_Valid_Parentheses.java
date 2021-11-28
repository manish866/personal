package DS;

public class Minimum_Remove_to_Make_Valid_Parentheses {
    public static void main(String[] args) {
        String s = "))((";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(c=='(')
                count++;
            else if(c==')')
            {
                if(count==0)
                    continue;
                count--;
            }
            sb.append(c);
        }
        System.out.println(count);
        System.out.println(sb);
        for (int i = sb.length()-1; i >= 0 && count>0; i--) {
                if(sb.charAt(i)=='(') {
                    sb.deleteCharAt(i);
                    count--;
                }
        }
        System.out.println(count);
        System.out.println(sb);
    }
}
