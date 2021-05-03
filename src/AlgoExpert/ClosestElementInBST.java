package AlgoExpert;

import PractiseSet1.BinarySearchTree;

public class ClosestElementInBST {
    static int globalClosest = Integer.MAX_VALUE;
    static int nodeData = -1;
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        BinarySearchTree tree = bst.constructTree();
        int k = 10;
//        findClosestByInorderTraversal(tree, k);
        findClosestByBSTProperty(tree, k);
        System.out.println("Closest in BST: " + nodeData);
    }

    private static void findClosestByInorderTraversal(BinarySearchTree tree, int k) {
        if(tree == null)
            return;
        findClosestByInorderTraversal(tree.left, k);
        if(Math.abs(tree.data - k) < globalClosest)  {
            globalClosest = Math.abs(tree.data - k);
            nodeData = tree.data;
        }
        findClosestByInorderTraversal(tree.right, k);
    }

    private static void findClosestByBSTProperty(BinarySearchTree tree, int k) {
        if(tree == null)
            return;
        if(Math.abs(tree.data - k) < globalClosest)  {
            globalClosest = Math.abs(tree.data - k);
            nodeData = tree.data;
        }
        if(tree.left != null && k < tree.data)
            findClosestByBSTProperty(tree.left, k);
        else if(tree.right != null && k > tree.data)
            findClosestByBSTProperty(tree.right, k);
    }
}

//O(n) inorder approach
//O(h) h-height BST  property approach
