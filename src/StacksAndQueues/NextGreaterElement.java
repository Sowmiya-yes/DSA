package StacksAndQueues;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {13, 7, 6, 12};
        int lastLargest;
        for(int i: arr) {
            while(!stack.empty() && i > stack.peek()) {
                lastLargest = i;
                System.out.println("Next largest for " + stack.pop() + " is " + lastLargest);
            }
            stack.push(i);
        }
        while(!stack.empty()) {
            System.out.println("Next largest for " + stack.pop() + " is -1");
        }
    }
}
