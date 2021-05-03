package week1;

import java.util.Stack;

class MinStack {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> aux = new Stack<>();

    void push(int el) {
        if(main.empty()) {
            main.push(el);
            aux.push(el);
        } else {
            main.push(el);
            if(el <= aux.peek())
               aux.push(el);
        }
    }

    int pop() {
        if(main.empty()) {
            System.out.println("Stack underflow");
        } else {
            int num = main.pop();
            if(num == aux.peek())
                aux.pop();
            return num;
        }
        return -1;
    }

    int getMin() {
        if(main.empty())
            System.out.println("Stack undeflow");
        else
            return aux.peek();
        return -1;
    }
}

public class SpecialStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(20);
        minStack.push(30);
        System.out.println(minStack.getMin());
        minStack.push(5);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}

