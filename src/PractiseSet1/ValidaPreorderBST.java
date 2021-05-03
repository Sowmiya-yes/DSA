package PractiseSet1;

import java.util.Stack;

public class ValidaPreorderBST {

    static boolean validatePreorderBST(int[] preorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE;

        for(int i: preorder) {
            System.out.println(i);
            if(i < root)
                return false;
            while(!stack.empty() && i > stack.peek()) {
                root = stack.pop();
            }
            stack.push(i);
        }
        return true;
    }

    public static void main(String[] args) {
        BinarySearchTree object = new BinarySearchTree();
        BinarySearchTree tree = object.constructTree();

        System.out.println(validatePreorderBST(new int[]{10, 5, 13, 7, 15, 20}));
    }
}
