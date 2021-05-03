package TreesAndGraphs;

public class MinimalTree {
    static BinaryTree constructMinimalBinaryTree(int start, int end, int[] array) {
        if(start > end)
            return null;
        int minIndex = (start + end) / 2;
        BinaryTree tree = new BinaryTree(array[minIndex]);
        tree.left = constructMinimalBinaryTree(start, minIndex - 1, array);
        tree.right = constructMinimalBinaryTree(minIndex +  1, end, array);
        return tree;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        BinaryTree constructedTree = constructMinimalBinaryTree(0, array.length - 1, array);
        InorderTraversal inorderTraversal = new InorderTraversal();
        inorderTraversal.displayTreeInorder(constructedTree);
    }
}
