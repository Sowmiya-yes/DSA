package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class StackUsingQueue {
    List<Integer> queue1;
    List<Integer> queue2;

    public StackUsingQueue() {
        this.queue1 = new ArrayList<>();
        this.queue2 = new ArrayList<>();
    }

    Boolean push(Integer value) {
        return queue1.add(value);
    }

    Integer pop() {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return -1;
        } else {
            while(queue1.size() != 1) {
                queue2.add(queue1.remove(0));
            }
            Integer removedElement = queue1.remove(0);
            List<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return removedElement;
        }
    }

    public static void main(String[] args) {
        StackUsingQueue stackUsingQueue = new StackUsingQueue();
        System.out.println(stackUsingQueue.push(1));
        
        System.out.println(stackUsingQueue.push(2));
        
        System.out.println(stackUsingQueue.push(3));
        
        System.out.println(stackUsingQueue.pop());
        
        System.out.println(stackUsingQueue.pop());

        System.out.println(stackUsingQueue.push(4));

        System.out.println(stackUsingQueue.pop());
        
        System.out.println(stackUsingQueue.pop());
    }
}
