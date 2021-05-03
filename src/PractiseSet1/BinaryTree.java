package PractiseSet1;

import Concepts.EspeciallyJava;

public class BinaryTree extends EspeciallyJava {
    public int data;
    public BinaryTree left, right, next, head, prev;

    public BinaryTree(int data) {
        this.data = data;
    }

    public BinaryTree() {

    }

    public BinaryTree constructTree() {
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.right = new BinaryTree(3);
        tree.left.right = new BinaryTree(4);
        tree.left.left = new BinaryTree(5);
        tree.right.right= new BinaryTree(6);
        return  tree;
    }
}
