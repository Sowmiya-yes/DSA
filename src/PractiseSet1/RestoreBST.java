package PractiseSet1;

import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> temp = new ArrayList<>();
    static boolean firstFount = false;
    static BinarySearchTree previous;

    static void recoverTree(BinarySearchTree root) {
        if(root == null) return;
        recoverTree(root.left);
        if(previous != null && root.data < previous.data) {
            if(!firstFount) {
                temp.add(previous.data);
                firstFount = !firstFount;
            } else temp.add(root.data);
        }
        previous = root;
        recoverTree(root.right);
    }
}


public class RestoreBST {

    public static void main(String[] args) {
        BinarySearchTree object = new BinarySearchTree();
        BinarySearchTree tree = object.constructTree();
        Solution.recoverTree(tree);
        System.out.println(Solution.temp);
    }
}

