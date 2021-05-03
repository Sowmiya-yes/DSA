package week1;

import java.util.LinkedList;
import java.util.Queue;

class Stacks {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    void push(int value) {
        queue2.add(value);
        while(!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;
    }

    int pop() {
        if(queue1.isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(0);
        }
        return queue1.remove();
    }
}

public class StackUsing2QueuesPushCostly {
    public static void main(String[] args) {
        Stacks stack= new Stacks();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
