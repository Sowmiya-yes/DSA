package week2;

class DLL {
    int data;
    DLL left, right, head, prev;

    public DLL(int data) {
        this.data = data;
    }

    void buildDLL(DLL root) {
        if(root == null)
            return;
        buildDLL(root.left);
        if(head == null) {
            head = root;
            prev = root;
        } else {
            prev.right = root;
            root.left = prev;
            prev = root;
        }
        buildDLL(root.right);
    }

    void printDLL(DLL root) {
        while (root != null) {
            System.out.println(root.data);
            root = root.right;
        }
    }
}

public class BinaryTreeToDLL {
    public static void main(String[] args) {
        DLL tree = new DLL(1);
        tree.left = new DLL(2);
        tree.right = new DLL(3);
        tree.left.left = new DLL(4);
        tree.left.right = new DLL(5);
        tree.right.right = new DLL(6);
        tree.left.left.left = new DLL(7);

        tree.buildDLL(tree);
        tree.printDLL(tree.head);
    }
}
