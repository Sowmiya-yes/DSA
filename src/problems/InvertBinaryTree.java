package problems;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public void inOrderTraversal(TreeNode root) {
        if(root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

//    public boolean isSymmetricUtil(TreeNode node1, TreeNode node2) {
//        if(node1 == null && node2 == null)
//            return true;
//
//        return (node1 != null
//          && node2 != null
//          && node1.val == node2.val
//          && isSymmetricUtil(node1.left, node2.right)
//          && isSymmetricUtil(node1.right, node2.left)
//        );
//
//    }
//
//
//    public boolean isSymmetric(TreeNode root) {
//        return isSymmetricUtil(root, root);
//    }

//    void levelOrderUtil(TreeNode root, int level, List<List<Integer>> temp) {
//        if(root == null)
//            return;
//        if(level == temp.size())
//            temp.add(new ArrayList<>());
//        temp.get(level).add(root.val);
//        levelOrderUtil(root.left, level + 1, temp);
//        levelOrderUtil(root.right, level + 1, temp);
//    }
//k
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> temp = new ArrayList<>();
//
//        levelOrderUtil(root, 0, temp);
//
//        return temp;
//    }
}

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);

        treeNode.inOrderTraversal(treeNode);
        System.out.println();
        treeNode.invertTree(treeNode);
        treeNode.inOrderTraversal(treeNode);
    }
}
