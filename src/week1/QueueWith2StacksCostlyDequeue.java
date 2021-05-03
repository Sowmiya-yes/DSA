package week1;

import java.util.Stack;

class Que {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void enqueue(int value) {
        stack1.push(value);
    }

    int dequeue() {
        if(stack2.empty()) {
            while(!stack1.empty())
                stack2.push(stack1.pop());
        }
        if(stack2.empty()) {
            System.out.println("Stack 2 Underflow");
            System.exit(0);
        }
        return stack2.pop();
    }
}

public class QueueWith2StacksCostlyDequeue {
    public static void main(String[] args) {
        Que queue = new Que();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
