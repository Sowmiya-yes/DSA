package TreesAndGraphs;

public class CommonAncestorBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTree.constructBinaryTree();
        System.out.println(findCommonAncestor(binaryTree, 12, 10));
    }

    private static BinaryTree findCommonAncestor(BinaryTree root, int node1, int node2) {
        if(root == null) return null;
        if(root.data == node1 || root.data == node2)
            return root;
        BinaryTree left = findCommonAncestor(root.left, node1, node2);
        BinaryTree right = findCommonAncestor(root.right, node1, node2);
        if(left != null && right != null) return root;
        return left != null ? left : right;
    }
}
