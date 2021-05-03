package week2;

import java.util.ArrayList;
import java.util.List;

class LCA {
    int data;
    LCA left, right;

    public LCA(int data) {
        this.data = data;
    }

    public void findCommonAncestor(LCA root, LCA node1, LCA node2) {
        List<Integer> node1_parent = new ArrayList<>();
        findNode(root, node1, node1_parent);
        System.out.println(node1_parent);

        List<Integer> node2_parent = new ArrayList<>();
        findNode(root, node2, node2_parent);
        System.out.println(node2_parent);

        int i = Math.min(node1_parent.size() - 1, node2_parent.size() - 1);
        if(node1_parent.size() == 1 || node2_parent.size() == 1) {
            System.out.println("Not found common ancestor");
            return;
        }
        while(i > -1) {
            if(node2_parent.get(i) == node1_parent.get(i))
                break;
            i--;
        }
        if(i != -1)
            System.out.println(node1_parent.get(i));
        else
            System.out.println("Not found common ancestor");
    }

    private boolean findNode(LCA root, LCA node, List<Integer> parent) {
        if(root == null)
            return false;

        parent.add(root.data);
        if(root.data == node.data)
            return true;

        if(findNode(root.left, node, parent))
            return true;
        if(findNode(root.right, node, parent))
            return true;

        parent.remove(parent.size() - 1);
        return false;
    }
}
public class CommonAncestor {
    public static void main(String[] args) {
        LCA root = new LCA(1);
        root.left = new LCA(2);
        root.right = new LCA(3);
        root.left.left = new LCA(4);
        root.left.right = new LCA(5);
        root.right.left = new LCA(6);
        root.right.right = new LCA(7);

        root.findCommonAncestor(root, root, root.left.left);
    }
}
