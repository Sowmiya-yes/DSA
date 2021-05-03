package week1;

import java.util.Stack;

class CustomStack {

    int top;
    int[] stack;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        top = 0;
    }

    public void push(int x) {
        if(top < stack.length) {
            stack[top] = x;
            top++;
        }
    }

    public int pop() {
        if(top > 0) {
            top--;
            int pop = stack[top];
            return pop;
        }
        return -1;
    }

    public void increment(int k, int val) {
        int i = 0;
        while(i < Math.min(k, top)) {
            stack[i++] += val;
        }
    }
}

public class CustomStackMain {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(5);
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(5);
        customStack.increment(10, 10);
        for(int i : customStack.stack) {
            System.out.print(i);
        }
    }
}
