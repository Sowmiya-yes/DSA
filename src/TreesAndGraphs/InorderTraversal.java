package TreesAndGraphs;

public class InorderTraversal {
    static void displayTreeInorder(BinaryTree root) {
        if(root == null) return;;
        displayTreeInorder(root.left);
        System.out.print(root.data + " ");
        displayTreeInorder(root.right);
    }
}
