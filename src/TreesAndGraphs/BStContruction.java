package TreesAndGraphs;

public class BStContruction {
    static BinaryTree binaryTree = null;
    static int size = 0;

    public static void main(String[] args) {
//        int[] arr = {10, 5, 3, 8, 10, 35, 27};
//        for(int i: arr) {
//            binaryTree = insertNode(binaryTree, i);
//            size++;
//        }
//        InorderTraversal.displayTreeInorder(binaryTree);
//        System.out.println();
//        System.out.println(size)
        Float f = new Float("3.0");
        double b = f.doubleValue();
        System.out.println(f.byteValue());
    }

    private static BinaryTree insertNode(BinaryTree binaryTree, int i) {
        if(binaryTree == null) {
            binaryTree = new BinaryTree(i);
        } else if(i <= binaryTree.data) {
            binaryTree.left = insertNode(binaryTree.left, i);
        } else {
            binaryTree.right = insertNode(binaryTree.right, i);
        }
        return binaryTree;
    }
}
