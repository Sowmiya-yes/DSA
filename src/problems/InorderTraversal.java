package problems;

import java.util.ArrayList;
import java.util.List;

class Solution {
    int data;
    Solution left, right;

    Solution(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    void inOrderRecursiveTraversal(Solution root, List<Integer> list) {
        if(root == null)
            return;
        inOrderRecursiveTraversal(root.left, list);
        list.add(root.data);
        inOrderRecursiveTraversal(root.right,list);
    }

    public List<Integer> inorderTraversal(Solution root) {
        List<Integer> list = new ArrayList<>();
        inOrderRecursiveTraversal(root, list);
        return list;
    }

    public void printLeftView(Solution root) {
        if(root == null)
            return;
        System.out.println(root.data);
        printLeftView(root.left);
    }

    int countLeafNodes(Solution root) {
        if(root == null)
            return 0;
        if(root.left ==  null && root.right == null)
            return 1;
        else
            return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
}

public class InorderTraversal {

    public static void main(String[] args) {
        Solution treeNode = new Solution(1);
        treeNode.left = new Solution(2);
        treeNode.right = new Solution(3);
        treeNode.left.left = new Solution(4);
        treeNode.left.right = new Solution(5);

//        treeNode.inorderTraversal(treeNode).forEach(System.out::println);

//        treeNode.printLeftView(treeNode);

        System.out.println(treeNode.countLeafNodes(treeNode));
    }
}
