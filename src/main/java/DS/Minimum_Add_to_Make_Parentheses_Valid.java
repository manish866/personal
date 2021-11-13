package DS;

import java.util.Stack;

public class Minimum_Add_to_Make_Parentheses_Valid {
    public static void main(String[] args) {
        String s = "())";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(stack.isEmpty())
                stack.push(c);
            else {
                if(c=='(')
                    stack.push(c);
                else if(stack.peek()=='(')
                    stack.pop();
                else stack.push(c);
            }
        }
        System.out.println(stack);
    }
}
