package TreesAndGraphs;


public class BinaryTree {
    int data;
    BinaryTree left, right, parent;

    public BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public static BinaryTree constructBinaryTree() {
        BinaryTree binaryTree = new BinaryTree(10);
        binaryTree.left = new BinaryTree(5);
        binaryTree.right = new BinaryTree(15);
        binaryTree.left.left = new BinaryTree(2);
        binaryTree.left.right = new BinaryTree(7);
        binaryTree.right.left = new BinaryTree(13);
        binaryTree.right.right = new BinaryTree(17);
//        binaryTree.parent = null;
//        binaryTree.left.parent = binaryTree;
//        binaryTree.right.parent = binaryTree;
//        binaryTree.left.left.parent = binaryTree.left;
//        binaryTree.left.right.parent = binaryTree.left;
//        binaryTree.right.left.parent = binaryTree.right;
//        binaryTree.right.right.parent = binaryTree.right;
        return binaryTree;
    }
}
