package AlgoExpert;

import PractiseSet1.BinaryTree;

public class BranchSums {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        BinaryTree tree = bt.constructTree();

        System.out.println(findBranchSumsByPreorder(tree, 0));
    }

    private static int findBranchSumsByPreorder(BinaryTree tree, int sum) {
        if(tree == null)
            return 0;
        sum = (sum * 10) + tree.data;
        if(tree.left == null && tree.right == null)
            return sum;
        return findBranchSumsByPreorder(tree.left, sum) + findBranchSumsByPreorder(tree.right, sum);
    }
}
