package DS;

import java.util.Stack;

public class Valid_Parenthesis_String {
    public static void main(String[] args) {
        String s = "(*))";
        Stack<Integer> bracket = new Stack<>();
        Stack<Integer> stars = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='(')
                bracket.push(i);
            else if(c=='*')
                stars.push(i);
            else if(!bracket.isEmpty())
                bracket.pop();
            else if(!stars.isEmpty())
                stars.pop();
            else System.out.println("False");
        }
        while (!stars.isEmpty() && !bracket.isEmpty() && bracket.peek()<stars.peek())
        {
            bracket.pop();
            stars.pop();
        }
        System.out.println(bracket.isEmpty());





    }
}
