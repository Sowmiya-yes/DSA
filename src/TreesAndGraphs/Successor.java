package TreesAndGraphs;

public class Successor {
    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTree.constructBinaryTree();
        BinaryTree nextNode = findSuccessor(binaryTree, 10);
        if(nextNode != null)
            System.out.println(nextNode.data);
        else
            System.out.println("No next node");
    }

    private static BinaryTree findSuccessor(BinaryTree root, int nodeExpected) {
        if(root == null)
            return null;
        if(root.data == nodeExpected) {
            if(root.right != null)
                return findDeepNode(root.right);
            else {
                while(root.parent != null && root.parent.right == root) {
                    root = root.parent;
                }
                return root.parent;
            }
        }
        BinaryTree foundNode = findSuccessor(root.left, nodeExpected);
        if(foundNode != null) return foundNode;
        return findSuccessor(root.right, nodeExpected);
    }

    private static BinaryTree findDeepNode(BinaryTree root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }
}
