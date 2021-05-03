package week2;

import java.util.ArrayList;
import java.util.List;

class Nodes {
    int data;
    Nodes right, left, pointer;

    public Nodes(int data) {
        this.data = data;
    }

    void connectNodesAtSameLevel(Nodes root) {
        if (root == null)
            return;
        if (root.left != null)
            root.left.pointer = root.right;
        if(root.right != null)
            root.right.pointer = root.pointer != null ?
                    root.pointer.left != null ? root.pointer.left : root.pointer.right : null;
        connectNodesAtSameLevel(root.left);
        connectNodesAtSameLevel(root.right);
    }

    void levelOrderUtil(Nodes root, int level, List<List<Integer>> temp) {
        if (root == null)
            return;
        if (level == temp.size()) {
            temp.add(new ArrayList<>());
            temp.get(level).add(root.data);
        }
        if (root.pointer != null)
            temp.get(level).add(root.pointer.data);
        levelOrderUtil(root.left, level + 1, temp);
        levelOrderUtil(root.right, level + 1, temp);
    }

    public List<List<Integer>> levelOrder(Nodes root) {
        List<List<Integer>> temp = new ArrayList<>();

        levelOrderUtil(root, 0, temp);

        return temp;
    }
}

public class NodesAtSameLevel {
    public static void main(String[] args) {
        Nodes treeNode = new Nodes(20);
        treeNode.left = new Nodes(8);
        treeNode.right = new Nodes(22);
        treeNode.left.left = new Nodes(5);
        treeNode.left.right = new Nodes(3);
        treeNode.left.right.left = new Nodes(10);
        treeNode.left.right.right = new Nodes(14);
        treeNode.right.right = new Nodes(25);

        treeNode.connectNodesAtSameLevel(treeNode);
        System.out.println(treeNode.levelOrder(treeNode));
    }
}
