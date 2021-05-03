package week1;

import java.util.Stack;

class Sol {
    static boolean checkMatching(Character a, Character b) {
        return (a == ')' && b == '(');
    }

    public int minAddToMakeValid(String S) {
        if(S == null || S.length() == 0 ) return 0;
        Stack<Character> stack = new Stack<>();
        stack.push(S.charAt(0));
        for(int i = 1; i < S.length(); i++) {
            if(!stack.isEmpty() && checkMatching(S.charAt(i), stack.peek())) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }
        return stack.size();
    }

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                stack.push(i);
            if(s.charAt(i) == ')') {
                if(!stack.empty())
                    stack.pop();
                else
                    sb.setCharAt(i, '*');
            }
        }
        while(!stack.empty())
            sb.setCharAt(stack.pop(), '*');
        return sb.toString().replaceAll("\\*", "");
    }
}

public class MinimumParantheses {
    public static void main(String[] args) {
        Sol sol = new Sol();
        System.out.println(sol.minAddToMakeValid("()))(("));
        System.out.println(sol.minRemoveToMakeValid("()))(("));
    }
}
