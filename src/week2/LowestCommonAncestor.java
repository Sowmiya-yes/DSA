package week2;

import java.util.ArrayList;
import java.util.List;

class CA {
    int data;
    CA left, right;

    public CA(int data) {
        this.data = data;
    }

    public void findCommonAncestor(CA root, CA node1, CA node2) {
        CA ancestor = findCommonAncestorUtil(root, node1, node2);
        if(ancestor != null)
            System.out.println(ancestor.data);
        else
            System.out.println("Not able to find the ancestor");
    }

    private CA findCommonAncestorUtil(CA root, CA node1, CA node2) {
        if(root == null)
            return null;
        if(root.data ==  node1.data || root.data == node2.data)
            return root;
        CA left = findCommonAncestorUtil(root.left, node1, node2);
        CA right = findCommonAncestorUtil(root.right, node1, node2);

        if(left != null && right != null)
            return root;

        return left != null ? left : right;
    }
}
public class LowestCommonAncestor {
    public static void main(String[] args) {
        CA root = new CA(1);
        root.left = new CA(2);
        root.right = new CA(3);
        root.left.left = new CA(4);
        root.left.right = new CA(5);
        root.right.left = new CA(6);
        root.right.right = new CA(7);

        root.findCommonAncestor(root, root.right, root.left.left);
    }
}
