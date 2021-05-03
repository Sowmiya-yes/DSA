package week2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class BST {
    int data;
    BST left, right;

    public BST(int data) {
        this.data = data;
    }

    void inOrderTraversal(BST root, List<Integer> temp) {
        if(root == null)
            return;
        inOrderTraversal(root.left, temp);
        temp.add(root.data);
        inOrderTraversal(root.right, temp);
    }

    boolean validateBST(BST root) {
        List<Integer> temp = new ArrayList<>();
        inOrderTraversal(root, temp);
        System.out.println(temp);
        if(temp.size() == 0)
            return true;
        else {
            int prev = temp.get(0);
            for(int i = 1; i < temp.size(); i++) {
                if(temp.get(i) < prev)
                    return false;
                prev = temp.get(i);
            }
            return true;
        }
    }

    boolean validateBSTOptimal(BST root, int min, int max) {
        if(root == null)
            return true;
        if((min!= Integer.MIN_VALUE && root.data <= min) || (max!= Integer.MAX_VALUE && root.data > max)) {
           return false;
        }
        if(!validateBSTOptimal(root.left, min, root.data) || !validateBSTOptimal(root.right, root.data, max))
            return false;
        return true;
    }

    boolean validateBST(BST tree, Integer max, Integer min) {
        if(tree == null) return true;
        if((max != null && max < tree.data) || (min != null) && min > tree.data) return false;
        return validateBST(tree.left, tree.data, min) && validateBST(tree.right, max, tree.data);
    }


    //valid BST from prorder array
//    public class Solution {
//    public int solve(ArrayList<Integer> A) {
//        Stack<Integer> stack = new Stack<>();
//        int root = Integer.MIN_VALUE;
//        for(int i: A) {
//            if(i < root)
//                return 0;
//            while(!stack.empty() && stack.peek() < i) {
//                root = stack.pop();
//            }
//            stack.push(i);
//        }
//        return 1;
//    }
//}
}

public class ValidateBST {
    public static void main(String[] args) {
        BST tree = new BST(6);
        tree.left = new BST(4);
        tree.right = new BST(1);
        tree.left.left = new BST(3);
        tree.left.right = new BST(5);

//        System.out.println(System.nanoTime());
//        System.out.println(tree.validateBST(tree));
//        System.out.println(System.nanoTime());
//
//        System.out.println(System.nanoTime());
//        System.out.println(tree.validateBSTOptimal(tree, Integer.MIN_VALUE, Integer.MAX_VALUE));
//        System.out.println(System.nanoTime());
        System.out.println(tree.validateBST(tree, null, null));
    }
}

// By BST Property
// Inorder
// Time complexity O(n)
// Space complexity O(h) h - height of the tree
