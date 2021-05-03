package TreesAndGraphs;

import TreesAndGraphs.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOfNodesAtEachLevel {

    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTree.constructBinaryTree();
        List<List<Integer>> nestedLinkedlist = new ArrayList<>();
        findListOfNodes(binaryTree, 0, nestedLinkedlist);
        System.out.println(nestedLinkedlist);
    }

    private static void findListOfNodes(BinaryTree root, int level, List<List<Integer>> list) {
        if(root == null) return;
        if(list.size() == level)
            list.add(new ArrayList<>());
        list.get(level).add(root.data);
        findListOfNodes(root.left, level + 1, list);
        findListOfNodes(root.right, level + 1, list);
    }
}
