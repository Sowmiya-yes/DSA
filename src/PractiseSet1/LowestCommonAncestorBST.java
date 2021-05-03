package PractiseSet1;

public class LowestCommonAncestorBST {

    static BinarySearchTree lowestCommonAncestor(BinarySearchTree root, int node1, int node2) {
        if(root == null)
            return null;
        if(root.data > node1 && root.data > node2)
            return lowestCommonAncestor(root.left, node1, node2);
        if(root.data < node1 && root.data < node2)
            return lowestCommonAncestor(root.right, node1, node2);
        return root;
    }
    public static void main(String[] args) {
        BinarySearchTree object = new BinarySearchTree();
        BinarySearchTree tree = object.constructTree();

        System.out.println(lowestCommonAncestor(tree, 3, 5).data);
    }
}
