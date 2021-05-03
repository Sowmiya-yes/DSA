package PractiseSet1;

public class BinaryTreeToDLL {
    static BinaryTree head, prev;

    static void convertBTToDLL(BinaryTree root) {
        if(root == null)
            return;
        convertBTToDLL(root.left);
        if(head == null) {
            head = root;
            prev = root;
        } else {
            prev.right = root;
            root.left= prev;
            prev = root;
        }
        convertBTToDLL(root.right);
    }

    static void printDLL(BinaryTree head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.right;
        }
    }

    public static void main(String[] args) {
        BinaryTree object = new BinaryTree();
        BinaryTree tree = object.constructTree();

        convertBTToDLL(tree);

        printDLL(head);
    }
}
