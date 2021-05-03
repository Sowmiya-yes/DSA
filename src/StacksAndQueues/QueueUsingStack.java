package StacksAndQueues;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueUsingStack() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public Integer enqueue(Integer value) {
        return stack1.push(value);
    }

    public Integer dequeue() {
        if(stack1.empty() && stack2.empty())
            return -1;
        else if(!stack2.empty())
            return stack2.pop();
        else {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack  = new QueueUsingStack();
        System.out.println(queueUsingStack.enqueue(1));
        System.out.println(queueUsingStack.enqueue(2));
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.enqueue(3));
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
    }
}
