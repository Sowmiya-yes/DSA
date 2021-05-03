package StacksAndQueues;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    List<T> queue;

    public Queue() {
        this.queue = new ArrayList<>();
    }

    boolean isEmpty() {
        return queue.size() == 0;
    }

    boolean enqueue(T value) {
        return queue.add(value);
    }

    T dequeue() {
        if(!queue.isEmpty()) {
            return queue.remove(0);
        } else {
            throw new RuntimeException(("Queue is Empty"));
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        System.out.println(queue.isEmpty());
        System.out.println(queue.enqueue(1));
        System.out.println(queue.enqueue(2));
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
