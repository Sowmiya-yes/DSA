package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

class StackNode<T> {
        List<T> stack;
        int capacity;
        int top;

    public StackNode() {
        this.stack = new ArrayList<>();
        this.capacity = 5;
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == capacity - 1;
    }

    public boolean push(T element) {
        if(!this.isFull()) {
            stack.add(element);
            top++;
            return true;
        }
        else {
            System.out.println("Stack is FULL");
            return false;
        }
    }

    public T pop() {
        if(!this.isEmpty()) {
            T value = stack.remove(top);
            top--;
            return value;
        } else {
            throw new RuntimeException("Stack is empty -  Cannot perform POP");
        }
    }

    public T peek() {
        if(!this.isEmpty()) {
            return stack.get(top);
        } else {
            throw new RuntimeException("Stack is empty -  Cannot perform POP");
        }
    }

    public boolean contains(T value) {
        for(int i = 0; i < top; i++) {
            if(stack.get(i) == value)
                return true;
        }
        return false;
    }
}

public class Stack {
    public static void main(String[] args) {
        StackNode<String> stackNode = new StackNode<>();
        System.out.println(stackNode.push("1"));
        
        System.out.println(stackNode.push("2"));
        
        System.out.println(stackNode.push("3"));
        
        System.out.println(stackNode.push("4"));
        
        System.out.println(stackNode.push("5"));

        System.out.println("Contains " + stackNode.contains("6"));
        System.out.println("Contains " + stackNode.contains("5"));

        System.out.println(stackNode.push("6"));

        System.out.println("Peek " + stackNode.peek());

        System.out.println(stackNode.pop());
        
        System.out.println(stackNode.pop());

        System.out.println(stackNode.pop());
        
        System.out.println(stackNode.pop());
        
        System.out.println(stackNode.pop());
        
        System.out.println(stackNode.pop());
        
    }
}
