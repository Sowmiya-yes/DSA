package week1;

import java.util.Stack;

public class ParanthesesBalanceChecking {
    static boolean checkMatching(Character a, Character b) {
        if(a == ')' && b == '(')
            return true;
        else if(a == '}' && b == '{')
            return true;
        else if(a == ']' && b == '[')
            return true;
        return false;
    }

    public static void main(String[] args) {
        String parantheses = "[()]{}{[()(})]()}";
        Stack<Character> stack = new Stack<Character>();
        stack.push(parantheses.charAt(0));
        for(int i = 1; i < parantheses.length(); i++) {
            if(!stack.empty() && ParanthesesBalanceChecking.checkMatching(parantheses.charAt(i), stack.peek())) {
                stack.pop();
            } else {
                stack.push(parantheses.charAt(i));
            }
        }
        if(stack.empty())
            System.out.println("Balanced");
        else
            System.out.println("Imbalanced");
    }
}
