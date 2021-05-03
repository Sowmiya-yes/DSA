package week1;

import java.util.Stack;

class SSolution {
    public int mctFromLeafValues(int[] arr) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        for(int i = 0; i < arr.length; i++) {
            while(!stack.empty() && stack.peek() <= arr[i]) {
                int num = stack.pop();
                res += num * Math.min(stack.peek(), arr[i]);
            }
            stack.push(arr[i]);
        }
        while(stack.size() > 2) {
            res += stack.pop() * stack.peek();
        }
        return res;

    }
}

public class MinimumSumBinaryTree {
    public static void main(String[] args) {
        SSolution sSolution = new SSolution();
        System.out.println(sSolution.mctFromLeafValues(new int[]{6, 2, 4}));
    }
}
