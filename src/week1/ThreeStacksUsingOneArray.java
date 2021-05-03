package week1;

import java.util.Arrays;

class StackUsingArray {
    int[] arr;
    int capacity;
    int top_1,  top_2, top_3;

    public StackUsingArray(int n) {
        arr = new int[n];
        capacity = n / 3;
        top_1 = -1;
        top_2 = top_1 + capacity;
        top_3 = top_2 + capacity;
    }

    void push(int el, int stack) {
        switch(stack) {
            case 1:
                if(!isFull(1)) {
                    top_1++;
                    arr[top_1] = el;
                }
                else
                    System.out.println("Stack 1 Overflow");
                break;
            case 2:
                if(!isFull(2)) {
                    top_2++;
                    arr[top_2] = el;
                }
                else
                    System.out.println("Stack 2 Overflow");
                break;
            case 3:
                if(!isFull(3)) {
                    top_3++;
                    arr[top_3] = el;
                }
                else
                    System.out.println("Stack 3 Overflow");
                break;
        }
    }

    int pop(int stack) {
        switch(stack) {
            case 1:
                if(!isEmpty(stack)) {
                    int el = arr[top_1];
                    arr[top_1] = 0;
                    top_1--;
                    return el;
                } else {
                    System.out.println("Stack 1 Underflow");
                }
            case 2:
                if(!isEmpty(stack)) {
                    int el = arr[top_2];
                    arr[top_2] = 0;
                    top_2--;
                    return el;
                } else {
                    System.out.println("Stack 2 Underflow");
                }
            case 3:
                if(!isEmpty(stack)) {
                    int el = arr[top_3];
                    arr[top_3] = 0;
                    top_3--;
                    return el;
                } else {
                    System.out.println("Stack 3 Underflow");
                }
        }
        return -1;
    }

    boolean isFull(int stack) {
        switch(stack) {
            case 1:
                return top_1 == capacity - 1;
            case 2:
                return top_2 == (2 * capacity) - 1;
            case 3:
                return top_3 == (3 * capacity) - 1;
        }
        return false;
    }

    boolean isEmpty(int stack) {
        switch(stack) {
            case 1:
                return top_1 == -1;
            case 2:
                return top_2 == capacity - 1;
            case 3:
                return top_3 == (2 * capacity) -1;
        }
        return false;
    }

    int top(int stack) {
        switch(stack) {
            case 1:
                return top_1;
            case 2:
                return top_2;
            case 3:
                return top_3;
        }
        return 0;
    }
}
public class ThreeStacksUsingOneArray {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(30);
        stack.push(1, 1);
        stack.push(2, 1);
        stack.push(11, 2);
        stack.push(12, 2);
        stack.push(21, 3);
        stack.push(22, 3);
        stack.push(3, 1);
        stack.push(4, 1);
        stack.push(5, 1);
        stack.push(6, 1);
        stack.push(7, 1);
        stack.push(8, 1);
        stack.push(9, 1);
        stack.push(10, 1);
        stack.push(100, 1);
        System.out.println(stack.pop(3));
        System.out.println(stack.pop(3));
        System.out.println(stack.pop(3));
        System.out.println(Arrays.toString(stack.arr));
    }
}


