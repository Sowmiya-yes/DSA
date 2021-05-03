package PractiseSet1;

public class BinarySearchTree {
    public int data;
    public BinarySearchTree left, right;

    public BinarySearchTree(int data) {
        this.data = data;
    }

    public BinarySearchTree() { }

    public BinarySearchTree constructTree() {
        BinarySearchTree tree = new BinarySearchTree(10);
        tree.left = new BinarySearchTree(5);
        tree.right = new BinarySearchTree(15);
        tree.left.left = new BinarySearchTree(3);
        tree.left.right = new BinarySearchTree(7);
        tree.right.right= new BinarySearchTree(20);
        return  tree;
    }
}
