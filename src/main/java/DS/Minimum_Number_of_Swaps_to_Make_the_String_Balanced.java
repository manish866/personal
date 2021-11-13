package DS;

import java.util.Stack;

public class Minimum_Number_of_Swaps_to_Make_the_String_Balanced {
    public static void main(String[] args) {
        String s = "]]][[[";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek()=='[' && ch==']')
                stack.pop();
            else if(ch=='[')
                stack.push(ch);
        }
        System.out.println(stack);
        System.out.println((stack.size()+1)/2);
    }
}
