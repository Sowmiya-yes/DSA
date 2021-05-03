package TreesAndGraphs;

public class BalancedTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTree.constructBinaryTree();
        Integer balance = checkBalance(binaryTree);
        if(balance != Integer.MIN_VALUE)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

    private static Integer checkBalance(BinaryTree root) {
        if(root == null) return 0;
        Integer lH = checkBalance(root.left);
        if(lH == Integer.MIN_VALUE) return lH;
        Integer rH = checkBalance(root.right);
        if(rH == Integer.MIN_VALUE) return rH;
        if(Math.abs(lH - rH) > 1)
            return Integer.MIN_VALUE;
        else
            return Math.max(lH, rH) + 1;
    }
}
