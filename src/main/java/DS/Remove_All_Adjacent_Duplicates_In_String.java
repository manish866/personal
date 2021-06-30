package DS;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        String s = "abbaca";
        String str ="";
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if(!st.empty() && st.peek()==c)
                st.pop();
            else {
                st.push(c);
            }
        }
        while (!st.empty())
            str+=st.pop();
        System.out.println(str);



        //OR//////


        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(sb.length()>0 && sb.charAt(sb.length()-1)==c)
                sb.deleteCharAt(sb.length()-1);
            else
                sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
