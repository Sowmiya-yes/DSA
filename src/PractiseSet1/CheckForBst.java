package PractiseSet1;

public class CheckForBst {

    static boolean checkForValidBST(BinarySearchTree root, Integer min, Integer max) {
        if(root == null)
            return true;
        if((min != null && root.data < min) || (max != null && root.data > max))
            return false;
        if(!checkForValidBST(root.left, min, root.data)
                || !checkForValidBST(root.right, root.data, max))
            return false;
        return true;
    }

    public static void main(String[] args) {
        BinarySearchTree object = new BinarySearchTree();
        BinarySearchTree tree = object.constructTree();
        System.out.println(CheckForBst.checkForValidBST(tree, null, null));
    }
}
