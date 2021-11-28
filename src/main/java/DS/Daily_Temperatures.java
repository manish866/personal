package DS;

import java.util.Stack;

public class Daily_Temperatures {
    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};
        int days[] = new int[temp.length];


        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temp.length; i++)
        {
            while (!stack.empty() && temp[stack.peek()]<temp[i])
            {
                days[stack.peek()] = i - stack.peek();
                stack.pop();
            }

            stack.push(i);
        }
        for (int i : days) {
            System.out.println(i);
        }
    }
}
