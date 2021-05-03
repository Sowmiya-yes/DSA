package StacksAndQueues;

import java.util.Stack;

class BalancingParanthesis {
    static boolean checker(String input) {
        Stack<Character> stack = new Stack<>();
        boolean isMatch = false;
        for(char i: input.toCharArray()) {
            if(!stack.empty() && (i == ')' || i == '}' || i == ']')) {
                switch(stack.peek()) {
                    case '(':
                        if(i == ')') isMatch = true;
                        break;
                    case '{':
                        if(i == '}') isMatch = true;
                        break;
                    case '[':
                        if(i == ']') isMatch = true;
                        break;
                }
                if(!isMatch) return false;
                else stack.pop();
            } else {
                stack.push(i);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String input = "[{}(())[]]{";
        System.out.println(checker(input));
    }
}
