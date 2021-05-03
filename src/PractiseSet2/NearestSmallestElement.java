package PractiseSet2;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestElement {


    static void findNearestSmallest(int[] arr, int[] res, int n) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i < n; i++) {
            while(!stack.empty() && arr[i] < stack.peek()) {
                stack.pop();
            }
            if(stack.empty())
                res[i] = -1;
            else
                res[i] = stack.peek();
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        int n = arr.length;
        int[] res = new int[n];
        findNearestSmallest(arr, res, n);
        System.out.println(Arrays.toString(res));
    }
}
