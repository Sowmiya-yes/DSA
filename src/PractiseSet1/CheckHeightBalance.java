package PractiseSet1;

public class CheckHeightBalance {

    static int checkBalance(BinaryTree root) {
        if(root == null)
            return 0;
        int left = checkBalance(root.left);
        if(left == Integer.MIN_VALUE) return left;
        int right = checkBalance(root.right);
        if(right == Integer.MIN_VALUE) return right;
        if(Math.abs(left - right) > 1)
            return Integer.MIN_VALUE;
        else
            return Math.max(left, right) + 1;
    }
    public static void main(String[] args) {
        BinaryTree object = new BinaryTree();
        BinaryTree tree = object.constructTree();

        System.out.println(checkBalance(tree) == Integer.MIN_VALUE ? "No" : "yes");
    }
}
