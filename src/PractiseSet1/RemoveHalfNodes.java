package PractiseSet1;


public class RemoveHalfNodes {
    static BinaryTree removeHalfNodes(BinaryTree root) {
        if(root == null) return null;
        root.left = removeHalfNodes(root.left);
        root.right = removeHalfNodes(root.right);

        if(root.left == null && root.right == null)
            return root;
        if(root.right == null) {
            return root.left;
        }
        if(root.left == null) {
            return root.right;
        }

        return root;
    }

    static void display(BinaryTree root) {
        if(root == null) return;
        display(root.left);
        System.out.println(root.data);
        display(root.right);
    }

    public static void main(String[] args) {
        BinaryTree object = new BinaryTree();
        BinaryTree tree = object.constructTree();

        tree = removeHalfNodes(tree);

        display(tree);
    }
}
