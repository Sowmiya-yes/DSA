package week1;

import java.util.Stack;

public class NextLargerElement {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 15};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            while(!stack.empty() && arr[i] > stack.peek()) {
                int num = stack.pop();
                System.out.println(num + " => " + arr[i]);
            }
            stack.push(arr[i]);
        }
        while(!stack.empty()) {
            System.out.println(stack.pop() + " => -1");
        }
    }
}
