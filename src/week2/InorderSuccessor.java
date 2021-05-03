package week2;

class BSTs {
    int data;
    BSTs left, right, parent;

    public BSTs(int data) {
        this.data = data;
        left = right = parent = null;
    }

    BSTs inOrderSuccessor(BSTs node) {
        if(node == null)
            return null;
        if(node.right == null && node.parent == null)
            return null;
        else if(node.right != null)
            return findDeepLeftChild(node.right);
        else {
            BSTs parent = node.parent;
            System.out.println(parent.data);
            while(parent != null && parent.right == node) {
                node = parent;
                parent = parent.parent;
            }
            return parent;
        }
    }

    private BSTs findDeepLeftChild(BSTs right) {
        if(right == null)
            return null;
        while(right.left != null)
            right = right.left;
        return right;
    }
}

    public class InorderSuccessor {
    public static void main(String[] args) {
        BSTs tree = new BSTs(20);
        tree.parent = null;
        tree.left = new BSTs(8);
        tree.left.parent = tree;
        tree.right = new BSTs(22);
        tree.right.parent = tree;
        tree.left.left = new BSTs(4);
        tree.left.left.parent = tree.left;
        tree.left.right = new BSTs(12);
        tree.left.right.parent = tree.left;

        BSTs node = tree.inOrderSuccessor(tree.left.right);
        if(node != null)
            System.out.println(node.data);
        else
            System.out.println("Not able to find the node in the tree");
    }
}
