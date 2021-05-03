package week2;

class Tree {
    int data;
    Tree left, right;

    public Tree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int findHeight(Tree root) {
        if (root == null)
            return 0;
        else {
            int left = findHeight(root.left);
            int right = findHeight(root.right);
            int res = left > right ? left + 1 : right + 1;
            return left > right ? left + 1 : right + 1;
        }
    }

    public boolean checkBalanced(Tree root) {
        if (root == null)
            return true;
        else {
            int left = findHeight(root.left);
            int right = findHeight(root.right);

            return Math.abs(left - right) <= 1 && checkBalanced(root.left) && checkBalanced(root.right);
        }
    }

    int checkBalancedOptimised(Tree root) {
        if(root == null)
            return 0;
        int left = checkBalancedOptimised(root.left);
        if(left == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        int right = checkBalancedOptimised(root.right);
        if(right == Integer.MIN_VALUE) return Integer.MIN_VALUE;

        if(Math.abs(left - right) > 1)
            return Integer.MIN_VALUE;
        else
            return  Math.max(left, right) +  1;
    }

}
public  class BalancedTree {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(3);
        tree.left.left = new Tree(4);
        tree.left.right = new Tree(5);
//        tree.right.right = new Tree(6);
        tree.left.left.left = new Tree(7);

        System.out.println(System.nanoTime());
        if(tree.checkBalanced(tree))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
        System.out.println(System.nanoTime());

        System.out.println(System.nanoTime());
        if(tree.checkBalancedOptimised(tree) == Integer.MIN_VALUE)
            System.out.println("Not Balanced");
        else
            System.out.println("Balanced");
        System.out.println(System.nanoTime());
    }
}
