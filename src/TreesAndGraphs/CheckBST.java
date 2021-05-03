package TreesAndGraphs;

public class CheckBST {
    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTree.constructBinaryTree();
        if(checkIfBST(binaryTree, null, null))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean checkIfBST(BinaryTree root, Integer min, Integer max) {
        if(root == null)
            return true;
        if((max != null && root.data > max) || (min != null && root.data < min))
            return false;
        return checkIfBST(root.left, min, root.data) && checkIfBST(root.right, root.data, max);
    }
}
