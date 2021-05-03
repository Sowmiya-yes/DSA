package StacksAndQueues;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new Stack<>();
        int[] arr =  {4, 8, 5, 2, 25};
        int lastSmallest;
        for(int i: arr) {
            while(!stack.empty() && i < stack.peek()) {
                lastSmallest = i;
                System.out.println("Next Smallest for " + stack.pop() + " is " + lastSmallest);
            }
            stack.push(i);
        }
        while(!stack.empty()) {
            System.out.println("Next Smallest for " + stack.pop() + " is -1");
        }
    }
}
