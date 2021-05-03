package TreesAndGraphs;

public class Subtree {
    public static void main(String[] args) {
        BinaryTree binaryTree1 = BinaryTree.constructBinaryTree();
        BinaryTree binaryTree2 = BinaryTree.constructBinaryTree().left;
        BinaryTree subtree = getSubtree(binaryTree1, binaryTree2.data);
        if(subtree != null)
            System.out.println(checkEquality(subtree, binaryTree2));
        else
            System.out.println("No Subtree Found");
    }

    private static boolean checkEquality(BinaryTree tree1, BinaryTree tree2) {
        if(tree1 == null && tree2 == null) return true;
        if(tree1 != null && tree2 != null) {
            System.out.println(tree1.data + " " + tree2.data);
            return (tree1.data == tree2.data) &&
                    checkEquality(tree1.left, tree2.left) &&
                    checkEquality(tree1.right, tree2.right);
        }
        return false;
    }

    private static BinaryTree getSubtree(BinaryTree root, int val) {
        if(root == null)
            return null;
        if(root.data == val)
            return root;
        BinaryTree left = getSubtree(root.left, val);
        if(left != null)
            return left;
        else
            return getSubtree(root.right, val);
    }


}
