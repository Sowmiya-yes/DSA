package week1;

import java.util.Stack;

class Queue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int value) {
        if(stack1.empty())
            stack1.push(value);
        else {
            while(!stack1.empty())
                stack2.push(stack1.pop());
            stack1.push(value);
            while(!stack2.empty())
               stack1.push(stack2.pop());
        }
    }

    int dequeue() {
        if(stack1.empty()) {
            System.out.println("Stack 1 underflow");
            System.exit(0);
        }
        return stack1.pop();
    }
}

public class QueueWith2Stacks {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
