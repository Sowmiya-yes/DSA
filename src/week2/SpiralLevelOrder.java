package week2;

class BT {
    int data;
    BT left, right;

    BT(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void printSpiralLevelOrder(BT root) {
        boolean ltr = false;
        for(int i = 1; i <= 4; i++) {
            printSpiralLevelOrderUtil(root, ltr, i);
            ltr = !ltr;
        }
    }

    private void printSpiralLevelOrderUtil(BT root, boolean ltr, int i) {
        if(root == null)
            return;

        if(i == 1)
            System.out.println(root.data);
        else {
            if(ltr) {
                printSpiralLevelOrderUtil(root.left, ltr, i - 1);
                printSpiralLevelOrderUtil(root.right, ltr, i - 1);
            } else {
                printSpiralLevelOrderUtil(root.right, ltr, i - 1);
                printSpiralLevelOrderUtil(root.left, ltr, i - 1);
            }
        }
    }
}

public class SpiralLevelOrder {
    public static void main(String[] args) {
        BT treeNode = new BT(20);
        treeNode.left = new BT(8);
        treeNode.right = new BT(22);
        treeNode.left.left = new BT(5);
        treeNode.left.right = new BT(3);
        treeNode.left.right.left = new BT(10);
        treeNode.left.right.right = new BT(14);
        treeNode.right.right = new BT(25);

        treeNode.printSpiralLevelOrder(treeNode);
    }
}
