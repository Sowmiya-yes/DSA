package week1;

import java.util.LinkedList;
import java.util.Queue;

class Stak {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    void push(int value) {
        queue1.add(value);
    }

    int pop() {
        if(queue1.isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        while(queue1.size() != 1) {
            queue2.add(queue1.remove());
        }

        int result = queue1.remove();

        Queue<Integer> q = queue1;
        queue1 = queue2;
        queue2 = q;

        return result;
    }
}

public class StackUsing2QueuesPopCostly {
    public static void main(String[] args) {
        Stak stack= new Stak();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
