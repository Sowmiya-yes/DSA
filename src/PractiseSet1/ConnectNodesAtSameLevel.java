package PractiseSet1;

public class ConnectNodesAtSameLevel {

    static void connectNodes(BinaryTree root) {
        if(root == null)
            return;
        if(root.left != null)
            root.left.next = root.right;
        if(root.right != null)
            root.right.next = root.next != null ?
                    (root.next.left != null ? root.next.left : root.next.right)
                    : null;

        connectNodes(root.left);
        connectNodes(root.right);
    }

    static void inorderTraversal(BinaryTree root) {
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.println(root.data + " -> " + (root.next != null ? root.next.data : null));
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        BinaryTree object = new BinaryTree();
        BinaryTree tree = object.constructTree();

        connectNodes(tree);

        inorderTraversal(tree);
    }
}
