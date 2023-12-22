package Stacks;

import java.util.Stack;

public class RPN {
    public int evalRPN(String[] tokens) {
        // ^ Fundamental is operand will be pushed to stack
        // ^ if an operator is there, pop out two elements from stack
        // ^ and perform that operation between those two elements

        Stack<Integer> stk = new Stack<>();

        // Iterate through the array of tokens
        for (String tok : tokens) {
            // If the token is an operator, pop two values from the stack and perform the
            // operation
            if (tok.equals("+")) {
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n2 + n1;
                stk.push(res);
            } else if (tok.equals("-")) {
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n2 - n1;
                stk.push(res);
            } else if (tok.equals("*")) {
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n2 * n1;
                stk.push(res);
            } else if (tok.equals("/")) {
                int n1 = stk.pop();
                int n2 = stk.pop();
                int res = n2 / n1;
                stk.push(res);
            } else {
                // If the token is not an operator, it's an operand, so push it onto the stack
                stk.push(Integer.parseInt(tok));
                // parseInt is used to convert string into integer
            }
        }

        // The final result is on top of the stack; pop and return it
        return stk.pop();
    }
}
