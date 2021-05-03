package TreesAndGraphs;

public class ClosestValueInBST {
    static Integer result = null;

    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTree.constructBinaryTree();
        findClosestValue(binaryTree, 25, Integer.MAX_VALUE);
        System.out.println(result);
    }

    private static void findClosestValue(BinaryTree binaryTree, int val, Integer lastDiff) {
        System.out.println("Called once");
        if(binaryTree == null) return;
        if(binaryTree.data == val) {
            result = binaryTree.data;
        }
        else if(val > binaryTree.data) {
            if(val - binaryTree.data < lastDiff) {
                lastDiff = val - binaryTree.data;
                result = binaryTree.data;
            }
            findClosestValue(binaryTree.right, val, lastDiff);
        } else {
            if(binaryTree.data - val < lastDiff) {
                lastDiff = binaryTree.data - val;
                result = binaryTree.data;
            }
            findClosestValue(binaryTree.left, val, lastDiff);
        }
    }
}
