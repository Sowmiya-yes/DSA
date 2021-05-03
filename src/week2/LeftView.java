package week2;

class BinTree {
    int data;
    BinTree left, right;
    int maxLevel;

    public BinTree(int data) {
        this.data = data;
        this.maxLevel = 0;
    }

    void printLeftView(int level, BinTree root) {
        if(root == null)
            return;
        if(level > maxLevel) {
            System.out.println(root.data);
            maxLevel = level;
        }

        printLeftView(level + 1, root.left);
        printLeftView(level + 1, root.right);
    }
}

public class LeftView {
    public static void main(String[] args) {
        BinTree tree = new BinTree(1);
        tree.left = new BinTree(2);
        tree.right = new BinTree(4);
        tree.left.left = new BinTree(11);
        tree.left.left.right = new BinTree(15);
        tree.right.left = new BinTree(9);
        tree.right.right = new BinTree(3);
        
        tree.printLeftView(1, tree);
    }
}
