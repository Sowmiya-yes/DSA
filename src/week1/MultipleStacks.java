package week1;

import java.util.Arrays;
import java.util.Stack;

class StackOfPlates {
    int currentStack;
    int currentTop;
    int capacity;
    Stack<Integer>[] stackList;

    public StackOfPlates(int currentStack, int currentTop, int capacity) {
        stackList = new Stack[5];
        stackList[0] = new Stack<>();
        this.currentStack = currentStack;
        this.currentTop = currentTop;
        this.capacity = capacity;
    }

    void push(int value) {
        if(currentTop == capacity - 1 && currentStack == stackList.length - 1) {
            System.out.println("All stacks are utilized");
            return;
        } else if(currentTop == capacity - 1) {
            currentStack++;
            stackList[currentStack] = new Stack<>();
            currentTop = -1;
            stackList[currentStack].push(value);
            currentTop++;
        } else {
            stackList[currentStack].push(value);
            currentTop++;
        }
    }

    int pop() {
        int el =-1;
        if(currentTop == -1 && currentStack == 0)
            System.out.println("All stacks are empty");
        else {
            if(currentTop == -1) {
                currentStack--;
                currentTop = capacity - 1;
            }
            el = stackList[currentStack].pop();
            currentTop--;
            return el;
        }
        return el;
    }
}

public class MultipleStacks {
    public static void main(String[] args) {
        StackOfPlates stackOfPlates = new StackOfPlates(0, -1, 5);
        for(int i = 0; i < 26; i++)
            stackOfPlates.push(i);
        System.out.println(Arrays.toString(stackOfPlates.stackList));
        for(int i = 0; i < 26; i++)
            System.out.println(stackOfPlates.pop());
        System.out.println(Arrays.toString(stackOfPlates.stackList));
    }
}
