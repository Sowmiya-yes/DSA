package PractiseSet1;

public class LeftViewOfBinaryTree {

    static int maxLevel = 0;
    static void printLeftViewOfBinaryTree(BinaryTree root, int level) {
        if(root == null)
            return;
        if(level > maxLevel) {
            System.out.println(root.data);
            maxLevel = level;
        }
        printLeftViewOfBinaryTree(root.left, level + 1);
        printLeftViewOfBinaryTree(root.right, level + 1);
    }

    public static void main(String[] args) {
        BinaryTree object = new BinaryTree();
        BinaryTree tree = object.constructTree();
        LeftViewOfBinaryTree.printLeftViewOfBinaryTree(tree, 1);
    }
}
