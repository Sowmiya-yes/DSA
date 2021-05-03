package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class MinStackNode {
    List<Integer> stack;
    int capacity;
    int top;
    int minimum;
    Stack<Integer> minStack;

    public MinStackNode() {
        this.stack = new ArrayList<>();
        this.capacity = 5;
        this.top = -1;
        minimum = Integer.MAX_VALUE;
        minStack = new Stack<>();
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == capacity - 1;
    }

    public boolean push(Integer element) {
        if(!this.isFull()) {
            stack.add(element);
            top++;

            if(!minStack.isEmpty()) {
                if(element <= minStack.peek()) {
                    minStack.push(element);
                }
            } else {
                minStack.push(element);
            }
            return true;
        }
        else {
            System.out.println("Stack is FULL");
            return false;
        }
    }

    public Integer pop() {
        if(!this.isEmpty()) {
            Integer value = stack.remove(top);
            top--;
            if(!minStack.isEmpty() && value == minStack.peek()) {
                minStack.pop();
            }
            return value;
        } else {
            throw new RuntimeException("Stack is empty -  Cannot perform POP");
        }
    }

    public Integer peek() {
        if(!this.isEmpty()) {
            return stack.get(top);
        } else {
            throw new RuntimeException("Stack is empty -  Cannot perform POP");
        }
    }

    public boolean contains(Integer value) {
        for(int i = 0; i < top; i++) {
            if(stack.get(i) == value)
                return true;
        }
        return false;
    }

    public Integer getMin() {
        if(!minStack.empty())
            return minStack.peek();
        else
            return -1;
    }
}

public class MinStack {
    public static void main(String[] args) {
        MinStackNode stackNode = new MinStackNode();
        System.out.println(stackNode.push(11));

        System.out.println(stackNode.push(20));

        System.out.println(stackNode.push(3));

        System.out.println("Min" +  stackNode.getMin());

        System.out.println(stackNode.push(14));

        System.out.println(stackNode.push(2));

        System.out.println("Contains " + stackNode.contains(14));
        System.out.println("Contains " + stackNode.contains(5));

        System.out.println(stackNode.push(6));

        System.out.println("Peek " + stackNode.peek());

        System.out.println(stackNode.pop());

        System.out.println(stackNode.pop());

        System.out.println(stackNode.pop());

        System.out.println("Min" +  stackNode.getMin());

        System.out.println(stackNode.pop());

        System.out.println(stackNode.pop());

        System.out.println("Min" +  stackNode.getMin());

        System.out.println(stackNode.pop());

    }
}

//O(1) and O(n) - stack space
// can be simplified by O(1)